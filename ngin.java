<<<<<<< HEAD
import java.util.Scanner;

public class ngin {
    private static DataChart dataChart;
    private static Chart currentFrame;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataChart = new DataChart();
        int choice;

        System.out.println("Welcome to Spreadsheet CLI");
        
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
                    editCell(scanner);
                    break;
                case 4:
                    // Placeholder for add/remove row/column functionality
                    break;
                case 5:
                    // Placeholder for save/load functionality                
                    break;
                case 6:
                    listCharts();  
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
    public static void listCharts() {
        dataChart.displayAll();
    }

    public static void loadCharts() {
        // Placeholder for loading charts from a file
    }

    public static void saveCharts() {
        // Placeholder for saving charts to a file
    }
    
    public static void menu() {
        System.out.println("\n1. Create New Chart");
        System.out.println("2. Display Current Chart");
        System.out.println("3. Edit Cell in Current Chart");
        System.out.println("4. Add or Remove Row/Column (coming soon)");
        System.out.println("5. Save/Load Chart (coming soon)");
        System.out.println("6. List All Charts (coming soon)");
        System.out.println("7. Exit");
    }

    public static void createChart(Scanner scanner) {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        currentFrame = new Chart(rows, cols);
        dataChart.addChart(currentFrame);
        System.out.println("Chart created successfully!");
    }

    public static void displayChart() {
        if (currentFrame != null) {
            System.out.println("=====================================");
            System.out.println(currentFrame);
            System.out.println("=====================================");
        } else {
            System.out.println("No chart to display. Create one first.");
        }
    }

    public static void editCell(Scanner scanner) {
        if (currentFrame == null) {
            System.out.println("Create a chart first.");
            return;
        }
        
        System.out.print("Enter row index: ");
        int row = scanner.nextInt();
        System.out.print("Enter column index: ");
        int col = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.println("Enter value type:");
        System.out.println("1. Integer");
        System.out.println("2. String");
        System.out.print("Choose (1 or 2): ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter value: ");
        String input = scanner.nextLine();
        
        if (typeChoice == 1) {
            try {
                int intValue = Integer.parseInt(input);
                currentFrame.setValue(row, col, intValue);
                System.out.println("Integer value added successfully!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Storing as string instead.");
                currentFrame.setValue(row, col, input);
            }
        } else if (typeChoice == 2) {
            currentFrame.setValue(row, col, input);
            System.out.println("String value added successfully!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
=======
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
>>>>>>> 89f33e08063dd056c65beb453c85d57c93904800
