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
    
    //Objeto perfil
    public static Perfil perfil=null;
    
    //Variables de las pantallas
    public static Log_in jfLogin=null;
    public static perfilDatos jfPerfil=null;
    public static Idioma jfIdioma=null;
    
    //Variables de audio
    public static AudioStream aLogin; //Boton del Perfil
    public static AudioStream aIdioma; //Boton de los idiomas
    
    //Conexión con MySQL
    public static MySqlConexion objConn = new MySqlConexion();
}
