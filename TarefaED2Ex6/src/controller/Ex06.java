package controller;

public class Ex06 {
	
	public Ex06() {
		super();
	}
	
	public int[] Trocavet (int[] vet, int fim, int inicio , int aux) {
		if (fim < inicio) { 
			return vet;
		}else {
			aux = vet[fim];
			vet[fim] = vet[inicio];
			vet[inicio] = aux;
		}
		return Trocavet(vet, fim - 1, inicio + 1, aux);
		
	}
}
	

