package myProject19;
import java.util.Scanner;

public class myProject19 {
	public static void main(String[]args) {
		int input;
		Scanner inp=new Scanner(System.in);
		System.out.print("Please enter a number:");
		input=inp.nextInt();
		for(int counter=1;counter<input;counter*=4) {
			System.out.println(counter);
		}System.out.println("-------------");
		for(int counter=1;counter<input;counter*=5) {
			System.out.println(counter);
		}
		
		
	}

}
