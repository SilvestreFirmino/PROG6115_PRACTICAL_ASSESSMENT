
package prog6115_practical_assessment;

import java.util.Scanner;


/**
 *
 * @author SYLVESTER FIRMINO
 */
public class PROG6115_PRACTICAL_ASSESSMENT {


    public static void main(String[] args) {

        System.out.println("Please select one of the following menu items:");
        System.out.println("*************************************");
        System.out.println("(1) Capture a new Series");
        System.out.println("(2) Search for a Series");
        System.out.println("(3) Update Series age restriction");
        System.out.println("(4) Delete a Series");
        System.out.println("(5) Print series report - 2025");
        System.out.println("(6) Exit Application");
        System.out.println("*************************************");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6){
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    Series.CaptureSeries();
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





}
