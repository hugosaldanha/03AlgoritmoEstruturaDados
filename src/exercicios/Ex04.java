package exercicios;
public class Ex04 {
	public static void main(String[] args) {
		int[] vet = { 6, 8, 1, 3, 5, 20, 18, 9, 7, 21, 15, 4, 2, 19, 17 };

		int buscar = busca(vet, 10);

		System.out.println("Resultado: " + buscar);

	}

	public static int busca(int[] vet, int n) {
		int cont = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > n) {
				cont ++;
			}
		}
		return cont;
	}
}
