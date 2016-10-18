import java.util.Scanner;

public class AulaPilha11102016 {

	public static void main(String[] args) {

		inverteLetra();
	}

	static void inverteLetra() {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		String[] valores = new String[3];

		System.out.println("Digite 3 letras!");

		valores[0] = entrada.nextLine();
		valores[1] = entrada.nextLine();
		valores[2] = entrada.nextLine();

		System.out.print("As letras digitas foram ");

		for (int j = 0; j < 3; j++) {

			System.out.print(valores[j]);

		}
		System.out.print("\nO inverso das letras é ");
		for (int j = 3; j > 0; j--) {

			System.out.print(valores[j-1]);
		}

	}

}
