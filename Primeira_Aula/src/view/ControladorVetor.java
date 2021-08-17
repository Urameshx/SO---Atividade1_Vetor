package view;

public class ControladorVetor {

	public ControladorVetor() {
		super();

	}

	@SuppressWarnings("unused")
	public void temp_vet (int[] vetor_int) {
		int tamanho = vetor_int.length;
		
		double temp_inicial = System.nanoTime();
		for(int i : vetor_int) {
			
		}
		
		double temp_final = System.nanoTime();
		double temp_total = temp_final - temp_inicial;
		temp_total = temp_total / Math.pow(10, 9);
		
		System.out.println(tamanho+" posições " + temp_total+"segundos. ");
	}
	
	public int [] novo_vet(int posicoes) {
		int[] vet = new int[posicoes];
		for(int i=0; i < posicoes; i++) {
			vet[i] = 0;
		}
		
		return vet;
	}

		
}
