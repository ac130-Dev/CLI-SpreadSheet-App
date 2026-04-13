public class Frame {
    private int rows;
    private int cols;
    private String chartName;
    private Cell[][] table;

    public Frame(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.chartName = "Untitled Chart";
        table = new Cell[rows][cols];
        // Initialize all cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = new Cell();
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Object getValue(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return table[row][col].getValue();
        }
        return null;
    }

    public void setValue(int row, int col, Object value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            table[row][col] = new Cell(value);
        }
    }
    public String getChartName() {
        return chartName;
    }
    public void setChartName(String chartName) {
        if (chartName != null && !chartName.trim().isEmpty()) {
            this.chartName = chartName;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Object val = table[i][j].getValue();
                sb.append(val != null ? val : "empty");
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

