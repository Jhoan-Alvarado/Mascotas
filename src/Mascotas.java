import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Mascotas {

	int cod, edad;
	String nombre, especie;
	 
	
	
	
	public Mascotas() {
		
		
	}
	
	
	public void ingresar() {
	
		cod = Integer.parseInt(JOptionPane.showInputDialog("codigo de la mascota"));
		nombre = JOptionPane.showInputDialog("nombre de la mascota");
		edad = Integer.parseInt(JOptionPane.showInputDialog("edad mascota"));
		especie = JOptionPane.showInputDialog("especie de la mascota");
		
		
	}
	
	
	public void mostrarDatos() {

		System.out.println("codigo mascota " + cod);
		System.out.println("nombre mascota " + nombre);
		System.out.println("edad mascota " + edad);
		System.out.println("especie msacota " + especie);
		
	}
	
	
	
	
	
	
	
	
	
}
