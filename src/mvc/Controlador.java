/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Oscar
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class Controlador implements ActionListener {
private Modelo modelo;
private Vista vista;
private Double tipovehi;
public Controlador(Modelo modelo, Vista vista) {
 this.modelo = modelo;
 this.vista = vista;
 this.vista.combo1.addActionListener(this);
 this.vista.combo2.addActionListener(this);
 this.vista.combo3.addActionListener(this);
}
public void iniciarVista() {
vista.setTitle("Prueva");
vista.pack();
vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
vista.setLocationRelativeTo(null);
vista.setVisible(true);
}
public void actionPerformed(ActionEvent evento) {
 if(vista.combo1 == evento.getSource()) {
if(!"".equals(vista.campoTexto.getText())) {
 try{
tipovehi = Double.parseDouble(vista.campoTexto.getText());
modelo.setTipoVehi(tipovehi);
//modelo.setMoneda(13.943);
modelo.combo1();
vista.lResultado.setText(modelo.getCosto().toString()+"Hola");
 }catch(NumberFormatException e) {
vista.lResultado.setText("Introduzca una cantidad valida...");
 }
}
 }
 else if(vista.combo2 == evento.getSource()) {
if(!"".equals(vista.campoTexto.getText())) { try{
tipovehi = Double.parseDouble(vista.campoTexto.getText());
modelo.setTipoVehi(tipovehi);
//modelo.setMoneda(0.072);
modelo.combo2();
vista.lResultado.setText(modelo.getCosto().toString());
 }catch(NumberFormatException e) {
vista.lResultado.setText("Introduzca una cantidad valida...");
 }
}
 }
 else if(vista.combo3 == evento.getSource()) {
if(!"".equals(vista.campoTexto.getText())) { try{
tipovehi = Double.parseDouble(vista.campoTexto.getText());
modelo.setTipoVehi(tipovehi);
//modelo.setMoneda(0.072);
modelo.combo3();
vista.lResultado.setText(modelo.getCosto().toString());
 }catch(NumberFormatException e) {
vista.lResultado.setText("Introduzca una cantidad valida...");
 }
}
 }
}
}
