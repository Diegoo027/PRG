package Ejer1;
import daw.com.Pantalla;
import daw.com.Teclado;

public class TrianguloI {
	
	private double b;
	private double h;
	
	public TrianguloI(double b, double h) {
		this.b = b;
		this.h = h;
	}
	
	public float area() {
		return (float)(b*h)/2;
	}
	
	public float perimetro() {
		return (float)(Math.sqrt(((b/2)*(b/2))+(h*h))*2 + b);
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	
	public void leerDatos() {
		
		setB (cambiarDouble(1.0, "base"));
		setH (cambiarDouble(1.0, "altura"));
	}
	
	public double cambiarDouble(double x, String tipo){
		do {
		Pantalla.escribirString("Indica la nueva " + tipo + ": ");
		String xNueva = Teclado.leerString();
		if (!xNueva.isEmpty()) {
			try {
				x = Double.parseDouble(xNueva);
			} catch (NumberFormatException e) {
				x = -1;
			}
		} 
		} while (x < 0.0);
		return x;
		
	}
}
