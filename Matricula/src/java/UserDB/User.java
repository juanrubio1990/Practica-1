/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDB;
import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class User implements Serializable {
    private String usuario;
    private String contraseña;
    

    public User() {
        usuario = "";
        contraseña = "";
        
    }

    public User(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
       
    }

    public String getusuario() {
        return usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

    public String getcontraseña() {
        return contraseña;
    }

    public void setcontraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
