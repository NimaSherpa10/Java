package practice;
import java.util.Scanner;
import java.util.Arrays;
public class array {
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int []ar=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Read the values from the console");
		for(int i=0;i<ar.length;++i)
		{
			System.out.println("Enter The value");
			ar[i]=sc.nextInt();
			
		}
		System.out.println("Display Values");
		
		for(int k : ar)
		{
			System.out.println(k);
		}
		
		System.out.println(Arrays.toString(ar));
		
	}
 
}
