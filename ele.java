import java.util.*;
class ele{
	static void b2d(int n){
		int i=0;
		int binary[] = new int[100];
		binary[i++] = n%2;
		n = n/2;
		b2d(n);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num  = input.nextInt();
		b2d(num);
		
	}
}