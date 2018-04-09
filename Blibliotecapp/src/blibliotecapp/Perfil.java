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
public class Perfil {
    private String nom;
    private int libros;
    private String datos;

    public Perfil(String nom, int libros, String datos) {
        this.nom = nom;
        this.libros = libros;
        this.datos = datos;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLibros() {
        return libros;
    }

    public void setLibros(int libros) {
        this.libros = libros;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }    
}
