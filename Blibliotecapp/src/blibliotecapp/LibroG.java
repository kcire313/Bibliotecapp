/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

/**
 *
 * @author erick
 */
public class LibroG {
    private int id_prestamo;
    private int id_usuario;
    private String id_libro;
    private String fecha_pres;
    private String fecha_dev;
    private boolean devuelto;
    private int renovacion;
    private String titulo;
    private String autor;
    private int anio;
    private int ubicacion;
    private int cover;

    public LibroG(int id_prestamo, int id_usuario, String id_libro, String fecha_pres, String fecha_dev, boolean devuelto, int renovacion, String titulo, String autor, int anio, int ubicacion, int cover) {
        this.id_prestamo = id_prestamo;
        this.id_usuario = id_usuario;
        this.id_libro = id_libro;
        this.fecha_pres = fecha_pres;
        this.fecha_dev = fecha_dev;
        this.devuelto = devuelto;
        this.renovacion = renovacion;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.ubicacion = ubicacion;
        this.cover  = cover;
    }

    public LibroG(String id_libro, String titulo, String autor, int anio, int ubicacion, int cover) {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.ubicacion = ubicacion;
        this.cover = cover;
    }
    
    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getFecha_pres() {
        return fecha_pres;
    }

    public void setFecha_pres(String fecha_pres) {
        this.fecha_pres = fecha_pres;
    }

    public String getFecha_dev() {
        return fecha_dev;
    }

    public void setFecha_dev(String fecha_dev) {
        this.fecha_dev = fecha_dev;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public int getRenovacion() {
        return renovacion;
    }

    public void setRenovacion(int renovacion) {
        this.renovacion = renovacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getStock() {
        return cover;
    }


}
