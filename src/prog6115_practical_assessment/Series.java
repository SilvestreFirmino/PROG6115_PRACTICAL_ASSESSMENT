package prog6115_practical_assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {

    private static final ArrayList<SeriesModel> seriesList = new ArrayList<>();

    public static void CaptureSeries() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the series id:");
        int id = enter.nextInt();

        enter.nextLine(); // consume newline
        System.out.print("Enter the series name:");
        String name = enter.nextLine();

        System.out.print("Enter the series age restriction:");
        int age = enter.nextInt();
        while (age < 2 || age > 18) {
            System.out.println("You have entered a incorrect series age !!!");
            System.out.println("Please re-enter the series age >>");
            age = enter.nextInt();
        }

        System.out.print("Enter the number of episodes:");
        int episodes = enter.nextInt();
        SeriesModel newSeries = new SeriesModel(id, name, age, episodes);
        seriesList.add(newSeries);

        System.out.println("Series captured successfully!");
        System.out.println("Enter (1) to launch menu or any other key to exit:");
        int choice = enter.nextInt();
        if (choice == 1) {
            printMenu();
        } else {
            System.out.println("Exiting the application...");
            System.exit(0);
        }
    }

    public static void SearchSeries() {
        if (seriesList.isEmpty()) {
            System.out.println("No series available to search.");
            return;
        }
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the series ID to search:");
        int searchId = enter.nextInt();
        SeriesModel found = null;
        for (int i = 0; i < seriesList.size(); i++) {
            SeriesModel s = seriesList.get(i);
            if (s.getId() == searchId) {
                found = s;
                break;
            }
        }
        if (found != null) {
            System.out.println("--------------------------------------------------");
            System.out.println("Series found:");
            System.out.println("Series ID: " + found.getId());
            System.out.println("Series Name: " + found.getName());
            System.out.println("Series Age Restriction: " + found.getAge() + " years");
            System.out.println("Number of Episodes: " + found.getEpisodes());
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("Series with Series Id: " + searchId + " not found!");
        }

        System.out.println("Enter (1) to launch menu or any other key to exit:");
        int choice = enter.nextInt();
        if (choice == 1) {
            printMenu();
        } else {
            System.out.println("Exiting the application...");
            System.exit(0);
        }
    }

    public static void UpdateSeries() {
        if (seriesList.isEmpty()) {
            System.out.println("No series available to update.");
            return;
        }
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the series ID to update:");
        int updateId = enter.nextInt();
        SeriesModel found = null;
        for (int i = 0; i < seriesList.size(); i++) {
            SeriesModel s = seriesList.get(i);
            if (s.getId() == updateId) {
                found = s;
                break;
            }
        }
        if (found != null) {
            System.out.println("Current Series Name: " + found.getName());
            System.out.println("Enter new Series Name:");
            enter.nextLine(); // consume newline
            String newName = enter.nextLine();
            found.setName(newName);

            System.out.println("Current Series Age Restriction: " + found.getAge() + " years");
            System.out.println("Enter new Series Age Restriction:");
            int newAge = enter.nextInt();
            while (newAge < 2 || newAge > 18) {
                System.out.println("You have entered a incorrect series age !!!");
                System.out.println("Please re-enter the series age >>");
                newAge = enter.nextInt();
            }
            found.setAge(newAge);

            System.out.println("Current Number of Episodes: " + found.getEpisodes());
            System.out.println("Enter new Number of Episodes:");
            int newEpisodes = enter.nextInt();
            found.setEpisodes(newEpisodes);

            System.out.println("Series updated successfully!");
        } else {
            System.out.println("Series with ID: " + updateId + " not found!");
        }
        System.out.println("Enter (1) to launch menu or any other key to exit:");
        int choice = enter.nextInt();
        if (choice == 1) {
            printMenu();
        } else {
            System.out.println("Exiting the application...");
            System.exit(0);
        }
    }

    public static void DeleteSeries() {
        if (seriesList.isEmpty()) {
            System.out.println("No series available to delete.");
            return;
        }
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the series ID to delete:");
        int deleteId = enter.nextInt();
        SeriesModel found = null;
        for (int i = 0; i < seriesList.size(); i++) {
            SeriesModel s = seriesList.get(i);
            if (s.getId() == deleteId) {
                found = s;
                break;
            }
        }
        if (found != null) {
            seriesList.remove(found);
            System.out.println("Series with ID: " + deleteId + " has been deleted successfully!");
        } else {
            System.out.println("Series with ID: " + deleteId + " not found!");
        }
        System.out.println("Enter (1) to launch menu or any other key to exit:");
        int choice = enter.nextInt();
        if (choice == 1) {
            printMenu();
        } else {
            System.out.println("Exiting the application...");
            System.exit(0);
        }
    }

    public static void SeriesReport() {
        if (seriesList.isEmpty()) {
            System.out.println("No series available to report.");
            return;
        }

        for (int i = 0; i < seriesList.size(); i++) {
            SeriesModel s = seriesList.get(i);
            System.out.println("Series " + (i + 1));
            System.out.println("-----------------------------------");
            System.out.println("SERIES ID: " + s.getId());
            System.out.println("SERIES NAME: " + s.getName());
            System.out.println("SERIES AGE RESTRICTION: " + s.getAge());
            System.out.println("NUMBER OF EPISODES: " + s.getEpisodes());
            System.out.println("-----------------------------------");
        }

        System.out.println("Enter (1) to launch menu or any other key to exit:");
        Scanner enter = new Scanner(System.in);
        int choice = enter.nextInt();
        if (choice == 1) {
            printMenu();
        } else {
            System.out.println("Exiting the application...");
            System.exit(0);
        }
    }

    public static void ExitSeriesApplication() {
        System.out.println("Exiting the Series Application. Goodbye!");
        System.exit(0);
    }

    private static void printMenu() {
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