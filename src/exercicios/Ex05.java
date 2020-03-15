package exercicios;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int[] vet = { 6, 8, 1, 3, 5, 20, 18, 9, 7, 21, 15, 4, 2, 19, 17 };

		System.out.print("Digite um número: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int buscar = busca(vet, 0, n);

		System.out.println("Resultado: " + buscar);
	}

	public static int busca(int vet[], int i, int n) {
		if ((i < vet.length) && (n > vet[i]))
			return busca(vet, i + 1, n);
		else
			return i;
	}
}
