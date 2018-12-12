package atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		method1();
		
		System.out.println("Fim programa !");
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START ****");
		method2();
		
		System.out.println("***METHOD1 END ****");
		
	}
	
	
	public static void method2() {
		System.out.println("***METHOD2 START ****");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int p = sc.nextInt();
			System.out.println(vect[p]);
		} catch (InputMismatchException e) {
			System.out.println("Input Error");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position !");
			e.printStackTrace();
			sc.next();
		}

		System.out.println("***METHOD2 END ****");
		sc.close();
	}
}
