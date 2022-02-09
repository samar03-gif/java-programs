import java.util.*;
class eleven{
	static void b2c(int num){
		int i=0;
		int bin[] = new int[100];
		while(num>0){
			bin[i++] = num%2;
			num = num/2;
		}
		for (int j = i-1;j>=0 ;j-- ) {	
			System.out.print(bin[j]);
			
		}
	}
	public  static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		int n = input.nextInt();
		System.out.print("Binary number is : ");
		b2c(n);
	}
}