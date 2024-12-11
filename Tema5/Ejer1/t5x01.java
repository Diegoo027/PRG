package Ejer1;

import daw.com.Teclado;

public class t5x01 {

	public static void main(String[] args) {
		
		int x = Teclado.leerInt("Dime el numero de triangulos: ");
		float [] array = new float[x];
		
		for (int i=0; i<x; i++) {
			TrianguloI triangulo = new TrianguloI(0.0, 0.0);
			triangulo.leerDatos();
			array[i] = triangulo.area();
		}

		float mayor = array[0];
		
		for (int i=0; i<x; i++) {
			if (array[i]>mayor) {
				mayor = array[i];
			}
		}
		System.out.println("El mayor area de los triangulos introducidos es: "+ mayor);
	}

}
