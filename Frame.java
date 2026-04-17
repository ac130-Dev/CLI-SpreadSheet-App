public class Frame {
    private int rows;
    private int cols;
    private Integer[][] table;

    public Frame(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        table = new Integer[rows][cols];
    }

    public int getRows() {
        return table.length;
    }

    public int getCols() {
        return table[0].length;
    }

    public Integer getValue(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return table[row][col];
        }
        return null;
    }

    public void setValue(int row, int col, Integer value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            table[row][col] = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Integer val = table[i][j];
                sb.append(val != null ? val : "null");
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

