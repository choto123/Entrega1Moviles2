package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {
    private String nombre;
    private Integer foto;
    private String precio;
    private String telefono;
    private String especialidad;
    private Integer valoracionRestaurante;
    private String descripcionRestaurante;

    public MoldeRestaurante(){
    }
    public MoldeRestaurante(String nombre, Integer foto, String precio, String telefono, String especialidad, Integer valoracionRestaurante, String descripcionRestaurante) {
        this.nombre = nombre;
        this.foto = foto;
        this.precio = precio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.valoracionRestaurante=valoracionRestaurante;
        this.descripcionRestaurante=descripcionRestaurante;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){ this.nombre=nombre;}

    public Integer getFoto(){return foto;}
    public void setFoto(Integer foto){this.foto=foto;}

    public String getPrecio(){return precio;}
    public void setPrecio(String precio){this.precio=precio;}

    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono=telefono;}

    public String getEspecialidad(){return especialidad;}
    public void setEspecialidad(String especialidad){this.especialidad=especialidad;}

    public Integer getValoracionRestaurante() {return valoracionRestaurante;}
    public void setValoracionRestaurante(Integer valoracionRestaurante) {this.valoracionRestaurante = valoracionRestaurante;}

    public String getDescripcionRestaurante() {return descripcionRestaurante;}
    public void setDescripcionRestaurante(String descripcionRestaurante) {this.descripcionRestaurante = descripcionRestaurante;}
}
