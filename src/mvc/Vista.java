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
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Vista extends JFrame{
public JButton combo1, combo2,combo3, noCombo;
private JPanel panelB, panelR;
public JLabel lResultado;
public JLabel textoLab;
public JTextField campoTexto,nom;
public Vista() {
getContentPane().setLayout(new BorderLayout());
panelB = new JPanel();
panelB.setLayout(new FlowLayout());panelR = new JPanel();
panelR.setLayout(new FlowLayout());
combo1 = new JButton("combo1");
combo2 = new JButton("combo2");
combo3 = new JButton ("combo3");
noCombo= new JButton ("Sin combo");
textoLab = new JLabel("Si es auto digite \"1\" o \"2\" si es caminoneta"+"\n\n\n");
lResultado = new JLabel("");
campoTexto = new JTextField(20);
panelB.add(combo1);
panelB.add(combo2);
panelB.add(combo3);
panelB.add(noCombo);
panelR.add(textoLab);
panelR.add(lResultado);
//panelR.add(nom);
add(campoTexto, BorderLayout.NORTH);
add(panelB, BorderLayout.SOUTH);
add(panelR, BorderLayout.CENTER);
}
}