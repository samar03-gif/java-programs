import java.util.*;
public class six{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        System.out.print("Enter third number : ");
        int c = input.nextInt();
        int result = Math.max(a,b);
        int final_result = Math.max(result,c);
        if(final_result == a){
            System.out.print("A is greatest number");
        }else if(final_result == b){
            System.out.print("B is greatest number");
        }else{
            System.out.print("C is greatest number");
        }
    }
}