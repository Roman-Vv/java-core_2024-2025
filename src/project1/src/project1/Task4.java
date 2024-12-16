package project1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число от 5 до 10:");
		int x = scanner.nextInt();
		if (x>=5 & x<=10) System.out.print("Число удовлетворяет условиям");
		else System.out.print("Число не удовлетворяет условиям");
		scanner.close();
	}

}
