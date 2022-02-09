package estrutura_condicional;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println("Bom Dia");
		if (x <= 0) {
			System.out.println("Boa Tarde");
		}
		System.out.println("Boa Noite");

		sc.close();
	}

}
