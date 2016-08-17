package pe.edu.upc.PROGRAWEB;

public class Fruta {

	//ATRIBUTOS INSTANCIA
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJuego;
	
	
	//ATRIBUTOS DE CLASE
	public static String LugarOrigen="UPC";

	
	//CONSTRUCTOR 
	public Fruta(){
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.puedoHacerJuego=false;
		
	}
	
	//METODOS DE ACCESOA A DATOS (SET Y GET)
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public boolean isPuedoHacerJuego() {
		return puedoHacerJuego;
	}


	public void setPuedoHacerJuego(boolean puedoHacerJuego) {
		this.puedoHacerJuego = puedoHacerJuego;
	}


	public Fruta(String nombre, String color, String sabor) {
		super(); //Heredar constructor clase Padre
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJuego=false;
	}
	
	//sobreescritura de metodos heredados
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJuego="
				+ puedoHacerJuego + "]";
	}
	
	
}
