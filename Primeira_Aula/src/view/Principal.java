package view;

public class Principal {

	public static void main(String[] args) {
		ControladorVetor vc = new ControladorVetor();
		
		int[] vet1000 = vc.novo_vet(1000);
		int[] vet10000 = vc.novo_vet(10000);
		int[] vet100000 = vc.novo_vet(100000);
		
		vc.temp_vet(vet1000);
		vc.temp_vet(vet10000);
		vc.temp_vet(vet100000);
		
	}
	
 
}
