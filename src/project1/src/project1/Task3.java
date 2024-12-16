package project1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число которое делится на 4 и при этом больше 10:");
		int x = scanner.nextInt();
		if (x%4==0 & x>10) System.out.print("Число удовлетворяет условиям");
		else System.out.print("Число не удовлетворяет условиям");
		scanner.close();
	}

}
