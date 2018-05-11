/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import sun.audio.AudioStream;

/**
 *
 * @author erick
 */
public class VarG {
    
    //Pienso pasar estas variables al objeto Perfil
    public static String id="NaN";
    public static String pass="NaN";
    public static int prestamos=0;
    public static String idioma="espanol";
    
    //Variable para saber que pagina abrir despues del login
    public static String currentFrame="perfil";
    
    //Objeto perfil
    public static Perfil perfil=null;
    
    //Variables de las pantallas
    public static Log_in jfLogin=null;
    public static perfilDatos jfPerfil=null;
    public static Idioma jfIdioma=null;
    public static Prestamo jfPrestamo=null;
    public static Renovar jfRenovar=null;
    public static Inicio jfInicio=null;
    public static Busqueda jfBusqueda=null;
    public static Devolucion jfDevolucion=null;
    public static Canjear jfCanjear=null;
    public static Libros jfLibros=null;
    
    //Variables de audio
    public static AudioStream aLogin; //Boton del Perfil
    public static AudioStream aIdioma; //Boton de los idiomas
    public static AudioStream aBusqueda; //Boton de los Busqueda
    public static AudioStream aPrestamo; //Boton de los prestamo
    public static AudioStream aRenovar; //Boton de los renovar
    public static AudioStream aDevolucion; //Boton de los devolucion
    public static AudioStream aPerfilDatos; //Boton de los devolucion
    
    //Conexión con MySQL
    public static MySqlConexion objConn = new MySqlConexion();
}
