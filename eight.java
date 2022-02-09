import java.util.*;
public class eight {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        System.out.print("Enter third number : ");
        int c = input.nextInt();
        int result = Math.min(a,b);
        int final_result = Math.min(result,c);
        if(final_result == a){
            System.out.print("A is smallest number");
        }else if(final_result == b){
            System.out.print("B is smallest number");
        }else{
            System.out.print("C is smallest number");
        }
    }

}
