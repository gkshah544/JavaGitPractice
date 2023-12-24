import java.util.*;
public class MilesConvertor {

  public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the starting point city");
      String starting_point = input.nextLine();
      System.out.println("Enter the starting point city");
      String ending_point = input.nextLine();
      System.out.println("Enter the distance between cities in miles");
      double distance_in_miles = input.nextDouble();
      double distance_in_kilometer = distance_in_miles *  1.609344;
      System.out.println("Distance from miles to kilometer: "+distance_in_kilometer);
   
  }
}
