package pe.edu.upc.view;

import pe.edu.upc.PROGRAWEB.Fruta;

public class appFruterriaupc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta objFruta=new Fruta ("Mango","Amarillo","Dulce");
		System.out.println(objFruta.toString());
		
		objFruta.LugarOrigen = "Otro Lugar";
		System.out.println(Fruta.LugarOrigen); 
	}

}
