import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Por favor digite uma palavra qualquer\n");
		String palavra = entrada.next();

		invertePalavra(palavra);
	}

	public static void invertePalavra(String palavra) {

		Scanner entrada = new Scanner(System.in);

		String[] valores = palavra.split("");

		System.out.println("A palavra ao contrario vai ficar\n");
		for (int i = valores.length - 1; i >= 0; i--) {

			System.out.println(valores[i]);

		}

		entrada.close();
	}

}
