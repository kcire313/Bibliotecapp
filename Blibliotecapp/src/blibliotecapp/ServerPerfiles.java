/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class ServerPerfiles extends UnicastRemoteObject implements InterfaceRMI {

    public ServerPerfiles() throws RemoteException {
        super();
    }

    @Override
    public void perfil(String id, String pass) throws Exception {
        System.out.println("Entró");
        //String consulta = "select * from usuario where ID=" + id + ";";
        //VarG.objConn.Consultar(consulta);
        //if (VarG.objConn.rs.getRow() != 0) {
        VarG.id = VarG.objConn.rs.getString(1);
        VarG.pass = VarG.objConn.rs.getString(2);
        VarG.prestamos = VarG.objConn.rs.getInt(3);
        VarG.jfPerfil.setVisible(true);
        VarG.jfLogin.setVisible(false);
        //}
        //String nom, int libros, String datos
        //return new Perfil("hola", 2, "hola");
    }
}
