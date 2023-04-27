/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Login;
import java.sql.SQLException;

/**
 *
 * @author KEVIN SANCHEZ
 */
public class usuario {

    private String usuario;
    private String contra;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private String cedula;
    Login conexion = new Login();

    public usuario(String usuario, String contra, String nombre, String apellido, int edad, String telefono, String correo, String cedula) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
    }

    public usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "usuario{" + "usuario=" + usuario + ", contra=" + contra + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono + ", correo=" + correo + ", cedula=" + cedula + '}';
    }

    public void registrar() throws SQLException {
        String sql = "INSERT INTO public.usuarios(\n"
                + "	usuario, contrasena, nombre, apellido, edad, cedula, correo, telefono)\n"
                + "	VALUES ('" + getUsuario() + "', '" + getContra() + "', '" + getNombre() + "', '" + getApellido() + "', '" + getEdad() + "', '" + getCedula() + "', '" + getCorreo() + "','" + getTelefono() + "');";
        conexion.accion(sql);
    }
    
    public void Modificar() throws SQLException{
        String sql="UPDATE public.usuarios\n" +
"	SET  contrasena= '" + getContra() + "'" +
"	WHERE usuario='" + getUsuario() + "';";
        conexion.accion(sql);
    }

}
