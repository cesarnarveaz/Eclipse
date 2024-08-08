package com.sena.invetario.crud_springboot.models;

import org.springframework.web.multipart.MultipartFile;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@SuppressWarnings("unused")
public class ClienteDto {
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@NotEmpty(message = "El nombre es obligatorio")
	private String nombre;
	
	@NotEmpty(message = "La marca es Obligatorio")
	private String apellido;
	
	@NotEmpty(message = "El nombre de la categoría es obligatorio")
	private String Email;
	
	@Min(0)
	private double telefono;
	
	@Size(min=10, message ="La descripción debe tener mas de 10 caracters")
	@Size(max=255, message = "La descripción no debe exceder los 200 caracters")
	private String descripcion;

}
