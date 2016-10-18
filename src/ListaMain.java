import java.util.Scanner;

public class ListaMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma palavra qualquer");
		String palavra = entrada.next();

		String[] letra = palavra.split("");

		Lista valor = new Lista();
		Lista lista = new Lista();
		
		lista.palavra = letra[0];
		valor =  lista;
		lista.anterior = null;
				
		for (int i = 1; i < letra.length; i++) {
			
			Lista abc = new Lista();
			abc.palavra = letra[i];
			
			valor.proximo = abc;
			abc.anterior = valor;
			valor = abc;

		}
		while(valor != null){
			System.out.println(valor.palavra);
			valor = valor.anterior;
		}
	}

}
