/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author erick
 */
public interface TestRemote extends Remote {

    String pullData(String id) throws RemoteException;

    String bookData(String id) throws RemoteException;
    
    String searchBook(String donde,String que,String tipo,String autor,String anio)throws RemoteException;
}
