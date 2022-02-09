import java.util.Scanner;
public class OctalToBinaryJava
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter octal number: ");
      int octal = Integer.parseInt(sc.nextLine(), 8);
      String strBinary = Integer.toBinaryString(octal);
      System.out.println("Binary value is: " + strBinary);
      sc.close();
   }
}