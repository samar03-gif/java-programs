import java.util.*;
public class ten {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first term of equation : ");
	double a = input.nextDouble();
	System.out.print("Enter second term of equation : ");
	double b = input.nextDouble();
	System.out.print("Enter third term of equation : ");
	double c = input.nextDouble();
	double D = (b*b)-(4*a*c);
	if(D>0) {
		double first_root = (-b+Math.sqrt(D)/2*a);
		double second_root = (-b-Math.sqrt(D)/2*a);
		System.out.println("First root of equation is "+first_root);
		System.out.print("Second root of equation is "+second_root);
	}else if(D==0) {
		double equal_roots = (-b+Math.sqrt(D)/2*a);
		System.out.print("Equal roots is"+equal_roots);
	}else {
		System.out.print("Root is imaginary");
	}
	}

}
