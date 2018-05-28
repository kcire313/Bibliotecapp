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
                        return VarG.id_usuario + "," + VarG.password + "," + VarG.nombre + "," + VarG.appat + "," + VarG.apmat + "," + VarG.puntaje;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                return "NaN";
            }

            @Override
            public String bookData(String id) {
                String results = "";
                String consulta = "select usa.id_prestamo, usuario.id_usuario, libro.id_libro, usa.devuelto, usa.renovacion, libro.titulo, libro.autor, libro.ubicacion, libro.cover, libro.anio, usa.fecha_pres, usa.fecha_dev "
                        + "from libro,usa,usuario where usuario.id_usuario='" + id
                        + "' and usuario.id_usuario=usa.id_usuario"
                        + " and usa.id_libro=libro.id_libro;";
                System.out.println(consulta);
                VarG.objConn.Consultar(consulta);
                try {
                    if (VarG.objConn.rs.getRow() != 0) {
                        int id_prestamo = VarG.objConn.rs.getInt("id_prestamo");
                        int id_usuario = VarG.objConn.rs.getInt("id_usuario");
                        String id_libro = VarG.objConn.rs.getString("id_libro");
                        String fecha_pres = VarG.objConn.rs.getString("fecha_pres");
                        String fecha_dev = VarG.objConn.rs.getString("fecha_dev");
                        boolean devuelto;
                        if (VarG.objConn.rs.getInt("devuelto") == 1) {
                            devuelto = true;
                        } else {
                            devuelto = false;
                        }
                        int renovacion = VarG.objConn.rs.getInt("renovacion");
                        String titulo = VarG.objConn.rs.getString("titulo");
                        String autor = VarG.objConn.rs.getString("autor");
                        int anio = VarG.objConn.rs.getInt("anio");
                        int ubicacion = VarG.objConn.rs.getInt("ubicacion");
                        int cover = VarG.objConn.rs.getInt("cover");
                        results = id_prestamo + "%" + id_usuario + "%" + id_libro + "%" + fecha_pres + "%" + fecha_dev + "%" + devuelto + "%" + renovacion + "%" + titulo + "%" + autor + "%" + anio + "%" + ubicacion + "%" + cover + "&";
                        //libros.add(new LibroG(id_prestamo, id_usuario, id_libro, fecha_pres, fecha_dev, devuelto, renovacion, titulo, autor, anio, ubicacion, stock));
                        //System.out.println(libros.get(0).getTitulo());
                        while (VarG.objConn.rs.next()) {
                            System.out.println("entro");
                            id_prestamo = VarG.objConn.rs.getInt("id_prestamo");
                            id_usuario = VarG.objConn.rs.getInt("id_usuario");
                            id_libro = VarG.objConn.rs.getString("id_libro");
                            fecha_pres = VarG.objConn.rs.getString("fecha_pres");
                            fecha_dev = VarG.objConn.rs.getString("fecha_dev");
                            if (VarG.objConn.rs.getInt("devuelto") == 1) {
                                devuelto = true;
                            } else {
                                devuelto = false;
                            }
                            renovacion = VarG.objConn.rs.getInt("renovacion");
                            titulo = VarG.objConn.rs.getString("titulo");
                            autor = VarG.objConn.rs.getString("autor");
                            anio = VarG.objConn.rs.getInt("anio");
                            ubicacion = VarG.objConn.rs.getInt("ubicacion");
                            cover = VarG.objConn.rs.getInt("cover");
                            results += id_prestamo + "%" + id_usuario + "%" + id_libro + "%" + fecha_pres + "%" + fecha_dev + "%" + devuelto + "%" + renovacion + "%" + titulo + "%" + autor + "%" + anio + "%" + ubicacion + "%" + cover + "&";
                            //libros.add(new LibroG(id_prestamo, id_usuario, id_libro, fecha_pres, fecha_dev, devuelto, renovacion, titulo, autor, anio, ubicacion, stock));
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                return results;
            }

            @Override
            public String searchBook(String donde, String que, String tipo, String iautor, String ianio) throws RemoteException {
                String results = "";
                String consulta = "";
                if (tipo.equals("basica")) {
                    consulta = "select * from libro where " + donde + " like '%" + que + "%';";
                } else {
                    consulta = "select * from libro where titulo like '%" + que + "%' and autor like '%" + iautor + "%' and anio like '%" + ianio + "%';";
                }
                System.out.println(consulta);
                try {
                    VarG.objConn.Consultar(consulta);
                    if (VarG.objConn.rs.getRow() != 0) {
                        String id_libro = VarG.objConn.rs.getString("id_libro");
                        String titulo = VarG.objConn.rs.getString("titulo");
                        System.out.println(titulo);
                        String autor = VarG.objConn.rs.getString("autor");
                        int anio = VarG.objConn.rs.getInt("anio");
                        int ubicacion = VarG.objConn.rs.getInt("ubicacion");
                        int cover = VarG.objConn.rs.getInt("cover");
                        results = id_libro + "%" + titulo + "%" + autor + "%" + anio + "%" + ubicacion + "%" + cover + "&";
                        while (VarG.objConn.rs.next()) {
                            id_libro = VarG.objConn.rs.getString("id_libro");
                            titulo = VarG.objConn.rs.getString("titulo");
                            autor = VarG.objConn.rs.getString("autor");
                            anio = VarG.objConn.rs.getInt("anio");
                            ubicacion = VarG.objConn.rs.getInt("ubicacion");
                            cover = VarG.objConn.rs.getInt("cover");
                            results += id_libro + "%" + titulo + "%" + autor + "%" + anio + "%" + ubicacion + "%" + cover + "&";
                            //libros.add(new LibroG(id_prestamo, id_usuario, id_libro, fecha_pres, fecha_dev, devuelto, renovacion, titulo, autor, anio, ubicacion, stock));
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return results;
            }
        },
                0);

        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

        registry.bind(
                "Test", stub);

    }

}
