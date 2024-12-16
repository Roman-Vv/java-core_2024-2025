package project1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число:");
		int x = scanner.nextInt();
		x = x/1000;
		System.out.print("В ведённом числе  " +x +"  тысяч");
		scanner.close();
	}

}
