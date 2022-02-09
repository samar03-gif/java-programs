import java.util.*;
class table{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		int i =1;
		System.out.println("Table is ");
		while(i<=10){
			System.out.println(i+"x"+num+"="+i*num);
			i++;
		}
	}
}