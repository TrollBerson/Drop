/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.TLogin;
import Model.Login_Model;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Yoimar
 */
public class Login_Controller {

    private final Login_Model Lmodel = new Login_Model();
    private static TLogin UsuarioLogueado;
    private List<TLogin> loginresult;

    public Login_Controller() {
    }

    //Verifica que el usuario y contraseña esnten la DB
    public void Ingresar(TLogin User) {
        loginresult = Lmodel.ConsultarUsuarioContraseña(User);
        if (!loginresult.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inicio session");
            UsuarioLogueado = loginresult.get(0);
        }else{
        JOptionPane.showMessageDialog(null, "Error Usuario o Contraseña incorrectos");
        }
        System.out.println(UsuarioLogueado.getTlogEmail());

    }
}
