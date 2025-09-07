
package prog6112_practical_assessment;

import java.util.Scanner;


/**
 *
 * @author SYLVESTER FIRMINO
 */
public class PROG6112_PRACTICAL_ASSESSMENT {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Initialize choice to enter the loop
        int choice = 0;
        // Loop until the user chooses to exit
        while (choice != 6){
            printMenu(); // Print the menu repeatedly
            // Get the user's choice
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();         
            
            scanner.nextLine();
            // Handle the user's choice
            switch (choice) { // Switch statement to handle choices
                case 1:
                    Series.CaptureSeries(); // Call the static method from Series class
                        break;
                    case 2:
                    Series.SearchSeries();
                         break;
                    case 3:
                    Series.UpdateSeries();
                          break;
                    case 4:
                    Series.DeleteSeries();
                         break;
                    case 5:
                    Series.SeriesReport();
                        break;
                    case 6:
                    Series.ExitSeriesApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }


    }

    public static void printMenu() { // Method to print the menu
        System.out.println("Please select one of the following menu items:");
        System.out.println("*************************************");
        System.out.println("(1) Capture a new Series");
        System.out.println("(2) Search for a Series");
        System.out.println("(3) Update Series age restriction");
        System.out.println("(4) Delete a Series");
        System.out.println("(5) Print series report - 2025");
        System.out.println("(6) Exit Application");
        System.out.println("*************************************");
    }
}
