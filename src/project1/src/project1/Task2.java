package project1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число при деление на 5 в остатке будет 1, а при делении на 7 в остатке будет 1:");
		int x = scanner.nextInt();
		if (x%5==2 & x%7==1) System.out.print("Число удовлетворяет условиям");
		else System.out.print("Число не удовлетворяет условиям");
		scanner.close();
	}

}
