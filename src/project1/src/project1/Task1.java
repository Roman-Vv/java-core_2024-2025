package project1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число");
		int x = scanner.nextInt();
		if(x%3 == 0) System.out.print("Число делится на 3");
		else System.out.print("Число не делится на 3 без остатка");
		scanner.close();
		}
		
}
