package exercicios;

public class Ex03 {
	public static void main(String[] args) {
		int[] vet = { 6, 8, 1, 3, 5, 20, 18, 9, 7, 21, 15, 4, 2, 19, 17 };

		int buscar = busca(vet, 0);

		System.out.println("Resultado: " + buscar);

	}

	public static int busca(int[] vet, int i) {
		if (i < vet.length)
			return vet[i] + busca(vet, i + 1);
		else
			return 0;
	}
}
