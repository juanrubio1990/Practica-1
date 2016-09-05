/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import UserDB.User;

public class UserDB {

    public static long insert(User user) throws IOException {
        // TODO: Agregar codigo que permita crear un nuevo usuario en la base de datos 
        // NOTE: Esto se mostrara en sesiones posteriores
        File archivo=new File("texto.txt");
        FileWriter escribir=new FileWriter(archivo,true);
        escribir.write(user.getusuario());
        escribir.write(user.getcontraseña());
        return 0;
    }
}
