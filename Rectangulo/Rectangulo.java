import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double b;
	private double h;

	public Rectangulo() {
		this.color = 0;
		this.b = 0.0;
		this.h = 0.0;
		this.centro = new Punto();
	}
	
	public Rectangulo(int color, Punto centro, double b, double h) {
		this.color = color;
		this.b = b;
		this.h = h;
		this.centro = centro;
	}
	
	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.b = r.b;
		this.h = r.h;
		this.centro = new Punto(r.centro);
	}
	
	public void mostrarDatos() {
		Pantalla.escribirString("Base: " + String.valueOf(b));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura: " + String.valueOf(h));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color: " + String.valueOf(color));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("");
		centro.mostrarDatos();
		Pantalla.escribirSaltoLinea();
	}
	
	public void cambiarDatos() {
		
		cambiarDouble(h);
		this.h = h;
		
		cambiarDouble(b);
		this.b = b;
		
		cambiarInt(color);
		this.color = color;
		
		this.centro.setX(cambiarInt(1));
		
		this.centro.setY(cambiarInt(1));
		
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public double getH() {
		return h;
	}
	
	public void setH(int h) {
		this.h = h;
	}
	
	public double cambiarDouble(double x){
		do {
		Pantalla.escribirString("Indica la nueva medida: ");
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
	public int cambiarInt(int x){
		do {
		Pantalla.escribirString("Indica la nueva medida: ");
		String xNueva = Teclado.leerString();
		if (!xNueva.isEmpty()) {
			try {
				x = Integer.parseInt(xNueva);
			} catch (NumberFormatException e) {
				x = -1;
			}
		} 
		} while (x < 0.0);
		return x;
	}
}
