package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class MoldeTurismo implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String descripcion;
    private Integer valoracion;


    public MoldeTurismo(String nombre, String precio, String telefono, Integer foto, String descripcion, Integer valoracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.descripcion = descripcion;
        this.valoracion = valoracion;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getPrecio() {return precio;}
    public void setPrecio(String precio) {this.precio = precio;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public Integer getFoto() {return foto;}
    public void setFoto(Integer foto) {this.foto = foto;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public Integer getValoracion() {return valoracion;}
    public void setValoracion(Integer valoracion) {this.valoracion = valoracion;}
}
