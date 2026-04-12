
import java.util.ArrayList;

public class DataChart {
    private ArrayList<Frame> charts;
    private int cols;

    public DataChart(int cols) {
        this.cols = cols;
        this.charts = new ArrayList<>();
    }

    public void addChart(Frame frame) {
        if (frame != null) {
            charts.add(frame);
        }
    }

    public Frame getChart(int index) {
        if (index >= 0 && index < charts.size()) {
            return charts.get(index);
        }
        return null;
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
        for (int i = 0; i < cols * 20; i++) {
            border.append(symbol);
        }
        return border.toString();
    }

}
