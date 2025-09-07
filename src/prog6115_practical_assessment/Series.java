package prog6115_practical_assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {

    private static final ArrayList<SeriesModel> seriesList = new ArrayList<>(); // list to store series in a dynamic array

    public static void CaptureSeries() { // method to capture a new series
        Scanner enter = new Scanner(System.in);

        try { // try-catch block to handle invalid  inputs for id, age, and episodes in each method
            System.out.print("Enter the series id:");
            int id = enter.nextInt();

            enter.nextLine();
            System.out.print("Enter the series name:");
            String name = enter.nextLine();


            System.out.print("Enter the series age restriction:");
            int age = enter.nextInt();
            while (age < 2 || age > 18) { // validate age input
                System.out.println("You have entered a incorrect series age !!!");
                System.out.println("Please re-enter the series age >>");
                age = enter.nextInt();
            }

            System.out.print("Enter the number of episodes:");
            int episodes = enter.nextInt();
            SeriesModel newSeries = new SeriesModel(id, name, age, episodes);// create new SeriesModel object
            seriesList.add(newSeries);

            System.out.println("Series captured successfully!");
            try {
                System.out.println("Enter (1) to launch menu or any other key to exit:");
                int choice = enter.nextInt();
                if (choice != 1) {
                    ExitSeriesApplication();
                }
            } catch (Exception e) {
                ExitSeriesApplication(); // if non-number entered, just exit
            }

        }catch ( Exception e ){
            System.out.println("Invalid input. Please enter numeric values for id, age, and episodes.");
            System.out.println("Exiting the application...");
            ExitSeriesApplication();
        }

    }

    public static void SearchSeries() { // method to search for a series by id
        if (seriesList.isEmpty()) {
            System.out.println("No series available to search.");
            return;
        }
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the series ID to search:");
        int searchId = enter.nextInt();
        SeriesModel found = null; // variable to store the found series
        for (int i = 0; i < seriesList.size(); i++) { // loop through the seriesList to find the series with the given id
            SeriesModel s = seriesList.get(i);
            if (s.getId() == searchId) { // verify if the id matches
                found = s; // if found, assign it to the found variable
                break;
            }
        }
        if (found != null) { // if found, print the series details
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

        try { // prompt user to return to menu or exit for any input other than 1
            System.out.println("Enter (1) to launch menu or any other key to exit:");
            int choice = enter.nextInt();
            if (choice != 1) {
                ExitSeriesApplication();
            }
        } catch (Exception e) {
            ExitSeriesApplication(); // if non-number entered, just exit
        }

    }

    public static void UpdateSeries() { // method to update a series by id

        try {


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
        if (found != null) { // if found, prompt user to enter new details
            System.out.println("Current Series Name: " + found.getName());
            System.out.println("Enter new Series Name:");
            enter.nextLine(); // consume newline
            String newName = enter.nextLine();
            found.setName(newName);

            System.out.println("Current Series Age Restriction: " + found.getAge() + " years");
            try{
            System.out.println("Enter new Series Age Restriction:");
            int newAge = enter.nextInt();
            while (newAge < 2 || newAge > 18) {
                System.out.println("You have entered a incorrect series age !!!");
                System.out.println("Please re-enter the series age >>");
                newAge = enter.nextInt();
            }
            found.setAge(newAge);
            }catch (Exception e ){ // catch block to handle invalid input for age
                System.out.println("Invalid input. Please enter numeric values for age.");
                System.out.println("Exiting the application...");
                ExitSeriesApplication();
            }

            System.out.println("Current Number of Episodes: " + found.getEpisodes());
            System.out.println("Enter new Number of Episodes:");
            int newEpisodes = enter.nextInt();
            found.setEpisodes(newEpisodes);

            System.out.println("Series updated successfully!");
        } else {
            System.out.println("Series with ID: " + updateId + " not found!");
        }

        try {
            System.out.println("Enter (1) to launch menu or any other key to exit:");
            int choice = enter.nextInt();
            if (choice != 1) {
                ExitSeriesApplication();
            }
        } catch (Exception e) {
            ExitSeriesApplication(); // if non-number entered, just exit
        }

        }catch ( Exception e ){
            System.out.println("Invalid input. Please enter numeric values for id, age, and episodes.");
            System.out.println("Exiting the application...");
            ExitSeriesApplication();
        }
    }

    public static void DeleteSeries() { // method to delete a series by id
        try {


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

        System.out.println("Are you sure you want to delete the series with ID " + deleteId + "? Yes (y) to delete");
        String yesChoice = enter.next();
        if (yesChoice.equalsIgnoreCase("y")) {
            if (found != null) { // if found, remove it from the seriesList
                seriesList.remove(found);
                System.out.println("-------------------------------------------");
                System.out.println("Series with ID " + deleteId + " WAS deleted!");
                System.out.println("-------------------------------------------");
            } else {
                System.out.println("Series with ID: " + deleteId + " not found!");
            }
        }else{

            System.out.println("Series with ID " + deleteId + " was not deleted.");
        }
        try {
            System.out.println("Enter (1) to launch menu or any other key to exit:");
            int choice = enter.nextInt();
            if (choice != 1) {
                ExitSeriesApplication();
            }
        } catch (Exception e) {
            ExitSeriesApplication(); // if non-number entered, it will exit
        }

        }catch ( Exception e ) {
            System.out.println("Invalid input. Please enter numeric values for id.");
            System.out.println("Exiting the application...");
            ExitSeriesApplication();
        }

        }



    public static void SeriesReport() { // method to print a report of all series
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

        try {
            System.out.println("Enter (1) to launch menu or any other key to exit:");
            Scanner enter = new Scanner(System.in);
            int choice = enter.nextInt();
            if (choice != 1) {
                ExitSeriesApplication();
            }
        } catch (Exception e) {
            ExitSeriesApplication();
        }

    }

    public static void ExitSeriesApplication() { // method to exit the application
        System.out.println("Exiting the Series Application. Goodbye!");
        System.exit(0); // terminate the program
    }


}