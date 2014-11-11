package Practica08;
/*
 * Clase Contacto
 */


import java.util.ArrayList; 
import java.util.List;

public class Contacto implements Comparable<Contacto>{
	

private String nombre;
private String apellido; 
private String direccion;
private ArrayList<String> telefonos; 
private ArrayList<String> email;

public Contacto(String nombre, String apellido, ArrayList<String> telefonos, ArrayList<String> email) {
	this.nombre = nombre; 
	this.apellido = apellido; 
	this.telefonos = telefonos;
	this.email = email;
	}

	public List<String> getTelefono() {
		return this.telefonos; 
	}

	public void addTelefono(String telefono) { 
		this.telefonos.add(telefono); 
	}

	public ArrayList<String> getEmail() {
		return this.email;
	}

	public void addEmail(String email) { 
		this.email.add(email);
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre; 
	}

	public String getDireccion(){
		return this.direccion;
	}

	public String getApellido() { 
		return this.apellido; 
	}

	public boolean deleteTelefono(String telefono){
		if (this.telefonos.contains(telefono)){
			this.telefonos.remove(telefono);
			return true;
		}
		return false;
	}

	public boolean deleteEmail(String email){
		if (this.email.contains(email)){
			this.email.remove(email);
			return true;
		}
		return false;
	}

	@Override 
	public String toString() {
		return "Contacto [nombre=" + this.nombre + ", apellido=" + this.apellido + ", direccion= " + this.direccion + ", telefono=" + this.telefonos.toString() + ", email=" + this.email + "]"; 
	}

	@Override 
	public int compareTo(Contacto o) {

		if (this.apellido.compareToIgnoreCase(o.apellido) > 0) return 1; 
		if (this.apellido.compareToIgnoreCase(o.apellido) < 0) return -1;

		return 0; 
	}

	@Override 
	public boolean equals(Object obj) { 
		if (this == obj) return true;
		if (obj == null) return false; 
		if (getClass() != obj.getClass()) return false;
		Contacto other = (Contacto) obj; 
	
		if (apellido == null) {
			if (other.apellido != null) return false; 
		} else if (!apellido.equals(other.apellido)) return false;

	if (nombre == null) { 
		if (other.nombre != null) return false; 
		} else if (!nombre.equals(other.nombre)) return false;

	return true; 
	}
}