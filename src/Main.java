// -----------------------------------------------------
// Assignment 3 (Final project) - Question 1
// Written by: Julien Villanti - 2390054
// The first question asked us to write a program that outputs and prints the number of hours, minutes, and seconds that corresponds to 50391 total seconds.
// The output should be 13 hours, 59 minutes, and 51 seconds, and it needed to be solved only with arithmetic operators.
// -----------------------------------------------------


public class Main {
    public static void main(String[] args) {
        int totalSeconds = 50391;

        // Calculate hours, minutes, and seconds
        int hours = totalSeconds / 3600;        // 1 hour = 3600 seconds
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;    // 1 minute = 60 seconds
        int seconds = remainingSeconds % 60;

        //Displaying the result
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}


