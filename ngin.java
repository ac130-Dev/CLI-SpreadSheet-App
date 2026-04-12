import java.util.Scanner;

public class ngin {
    private static DataChart dataChart;
    private static Frame currentChart;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataChart = new DataChart(10);
        int choice;

        System.out.println(dataChart.border("*"));
        System.out.println("Welcome to Spreadsheet CLI");
        System.out.println(dataChart.border("*"));
        
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    createChart(scanner);
                    break;
                case 2:
                    displayChart();
                    break;
                case 3:
                    addElement(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void menu() {
        System.out.println("\n1. Create New Chart");
        System.out.println("2. Display Current Chart");
        System.out.println("3. Add Value to Chart");
        System.out.println("4. Exit");
    }

    public static void createChart(Scanner scanner) {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        currentChart = new Frame(rows, cols);
        dataChart.addChart(currentChart);
        System.out.println("Chart created successfully!");
    }

    public static void displayChart() {
        if (currentChart != null) {
            System.out.println(dataChart.border("="));
            System.out.println(currentChart);
            System.out.println(dataChart.border("="));
        } else {
            System.out.println("No chart to display. Create one first.");
        }
    }

    public static void addElement(Scanner scanner) {
        if (currentChart == null) {
            System.out.println("Create a chart first.");
            return;
        }
        
        System.out.print("Enter row index: ");
        int row = scanner.nextInt();
        System.out.print("Enter column index: ");
        int col = scanner.nextInt();
        System.out.print("Enter value: ");
        int value = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        currentChart.setValue(row, col, value);
        System.out.println("Value added successfully!");
    }
}
