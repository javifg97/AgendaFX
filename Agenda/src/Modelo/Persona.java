package Modelo;

public class Persona {
	
	private String Nombre;
	private String Apellido;
	private String Telefono;
	
	public Persona(String nombre, String apellido, String telefono) {
	    this.Nombre = nombre;
	    this.Apellido = apellido;
	    this.Telefono = telefono;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	
	
}
