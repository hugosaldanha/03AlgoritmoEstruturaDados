package exercicios;


public class Ex02 {
	public static void main(String[] args) {
		int[] vet = { 6, 8, 1, 3, 5, 20, 18, 9, 7, 21, 15, 4, 2, 19, 17 };
		
		int buscar15 = busca(vet, 0, 15);
		int buscar99 = busca(vet, 0, 99);
		
		System.out.println("O 15 está no índice: " + buscar15 + " do vetor.");
		System.out.println("O 99 está no índice: " + buscar99 + " do vetor.");
		
	}

	public static int busca(int vet[], int i, int n) {
		if ((i < vet.length) && (n != vet[i])) 
			return busca(vet, i+1, n);
		else 
			return i;
	}
}
