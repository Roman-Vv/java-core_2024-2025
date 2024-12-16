package project1;
import java.io.PrintWriter;
import java.util.Scanner;
public class Timus_1409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int numberOfCans = a + b -1;
		
		int harry = numberOfCans - a;
		int larry = numberOfCans - b;
		
		out.println(harry + " " + larry);
		out.flush();
	}

}
