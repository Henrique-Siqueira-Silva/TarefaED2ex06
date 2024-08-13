package view;

import controller.Ex06;


public class mainEx06 {
	public static void main (String args[]) {
		Ex06 m = new Ex06();
		
		
		int [] vet = new int[] {5,8,7,4,8,9,4,6,1,7,5};
		int [] vet2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		vet = m.Trocavet(vet, 10,0,0);
		vet2 = m.Trocavet(vet2, 9, 0,0);
		for ( int i =0; i < 11; i++) {
			System.out.print(vet[i]);
		}
		System.out.println(" ");
		for ( int i =0; i < 10; i++) {
			
			System.out.print(vet2[i]);
		}
		
		
	}

}
