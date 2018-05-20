/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public class Server {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        System.out.println("Servidor RMI activo");
        Remote stub = UnicastRemoteObject.exportObject(new TestRemote() {
            @Override
            public String pullData(String id) throws RemoteException {                
                try {
                    String consulta = "select * from usuario where id_usuario=" + id + ";";
                    VarG.objConn.Consultar(consulta);
                    if (VarG.objConn.rs.getRow() != 0) {                        
                        VarG.id_usuario = VarG.objConn.rs.getInt(1);
                        VarG.password = VarG.objConn.rs.getString(2);
                        VarG.nombre = VarG.objConn.rs.getString(3);
                        VarG.appat = VarG.objConn.rs.getString(4);
                        VarG.apmat = VarG.objConn.rs.getString(5);
                        VarG.puntaje = VarG.objConn.rs.getInt(6);   
                        return VarG.id_usuario+","+VarG.password+","+VarG.nombre+","+VarG.appat+","+VarG.apmat+","+VarG.puntaje;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                return "NaN";
            }
        }, 0);

        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        registry.bind("Test", stub);

    }

}
