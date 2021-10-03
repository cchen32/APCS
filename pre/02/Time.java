public class Time{
  public static void main(String[] args){
    System.out.println("Time to find time!");
    int hour = 16;
    int minute = 43;
    int second = 32;
    //Make the program calculate and display the number of seconds since
    //midnight.
    int midnightHr = hour - 0;
    int midnightMin = minute - 0;
    int midnightSec = second - 0;
    System.out.println("Time since midnight is:");
    System.out.println(midnightHr + " hours " + midnightMin + " minutes " +
    midnightSec + " seconds");
    //Calculate and display the number of seconds remaining in the day.
    int totalSec = 60 * 60 * 60 * 24;
    int daySec = (hour * 60 * 60) + (minute * 60) + second;
    int secLeft = totalSec - daySec;
    System.out.println("The number of seconds left is:");
    System.out.println(secLeft + " seconds");
    //Calculate and display the percentage of the day that has passed. You
    //might run into problems when computing percentages with integers, so
    //consider using floating-point.
    double percentPassed = daySec * 100 / totalSec;
    System.out.println("The percentage of the day passed is:");
    System.out.println(percentPassed + "%");
    //Change the values of hour, minute, and second to reflect the current time.
    //Then write code to compute the elapsed time since you started working on
    //this exercise.
  }
}
