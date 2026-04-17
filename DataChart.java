
import java.util.ArrayList;

public class DataChart {
    private ArrayList<Chart> charts;

    public DataChart() {
        this.charts = new ArrayList<>();
    }

    public void addChart(Chart chart) {
        if (chart != null) {
            charts.add(chart);
        }
    }

    public Chart getChart(int index) {
        if (index >= 0 && index < charts.size()) {
            return charts.get(index);
        }
        return null;
    }

    public int getChartCount() {
        return charts.size();
    }

    public void displayAll() {
        if (charts.isEmpty()) {
            System.out.println("No charts available.");
            return;
        }
        for (int i = 0; i < charts.size(); i++) {
            System.out.println("Chart " + (i + 1) + ":");
            System.out.println(charts.get(i));
        }
    }

    public String border(String symbol) {
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < 20 * 20; i++) {
            border.append(symbol);
        }
        return border.toString();
    }
}
