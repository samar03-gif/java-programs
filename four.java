import java.util.*;
public class four {
     public static void main(String args[]){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter first number : ");
     int first_number = input.nextInt();
     System.out.print("Enter second nubmer : ");
     int second_number = input.nextInt();
     int addition = first_number+second_number;
     int subtraction = first_number-second_number;
     int multiplication =first_number*second_number; 
     float division = (float)first_number/(float)second_number;  
     int moduls = first_number%second_number;
     System.out.println("The Addition of both number's is "+addition);
     System.out.println("The Subtraction of both number's is "+subtraction);
     System.out.println("The Multiplication of both number's is "+multiplication);
     System.out.println("The Division of both number's is "+division);
     System.out.print("The Modul(reminder) of both number's is "+moduls);


     }
}
