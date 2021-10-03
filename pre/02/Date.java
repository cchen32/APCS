public class Date{
  public static void main(String[] args){
    System.out.println("Hello!");
    //day is a String
    String day = "Friday";
    //date is an int
    int date = 20;
    //month is a String
    String month = "August";
    //year is an int
    int year = 2021;
    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European formate:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
}
