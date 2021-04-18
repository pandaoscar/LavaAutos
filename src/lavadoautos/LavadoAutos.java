/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadoautos;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mvc.Controlador;
import mvc.Modelo;
import mvc.Vista;
/**
 *
 * @author Oscar
 */
public class LavadoAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
 }
 catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
 }
Modelo modelo = new Modelo();
Vista vista = new Vista();
Controlador controlador = new Controlador(modelo, vista);
controlador.iniciarVista();
        
    }
    
}
