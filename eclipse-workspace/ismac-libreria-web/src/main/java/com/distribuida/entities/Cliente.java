
package com.distribuida.entities;	
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "cliente")
public class Cliente {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_cliente")
private int  idCliente;
@Column(name = "cedula")
private String cedula;
@Column(name = "nombre")
private String nombre;
@Column(name = "apellido")
private String apellido;
@Column(name = "direccion")
private String direcion;
@Column(name = "telefono")
private String telefono;
@Column(name = "correo")
private String correo;

public Cliente() { }




public Cliente(int idCliente, String cedula, String nombre, String apellido, String direcion, String telefono,
		String correo) {
	this.idCliente = idCliente;
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.direcion = direcion;
	this.telefono = telefono;
	this.correo = correo;
}




public int getIdCliente() {
	return idCliente;
}

public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

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

public String getDirecion() {
	return direcion;
}

public void setDirecion(String direcion) {
	this.direcion = direcion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
			+ ", direcion=" + direcion + ", telefono=" + telefono + ", correo=" + correo + "]";
} 




}
