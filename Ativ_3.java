package matriz;

import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];

		for (int L=0; L<3; L++) {
			for(int C=0; C<3; C++) {
				a[L][C] = (int) Math.round(Math.random()*100);
				b[L][C] = (int) Math.round(Math.random()*100);
				c[L][C] += a[L][C]*b[L][C];
			}
		}
		System.out.println("Matriz A");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+a[i][j]+"]");
			}
			System.out.println("\n---------------");
		}
		
		System.out.println("Matriz B");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+b[i][j]+"]");
			}
			System.out.println("\n---------------");
		}
		
		System.out.println("Matriz C");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+c[i][j]+"]");
			}
			System.out.println("\n---------------");
		}
		
		
}
}
