/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Modelo {
private Double tipoVehi;
    private Double labBasico;
    private Double labEspecial;
    private Double desigfecBasica;
    private Double desigfecAvanzada;
private Double costo;
private Double valor;

    public void setTipoVehi(Double tipoVehi) {
        this.tipoVehi = tipoVehi;
    }

    public void setLabBasico(Double labBasico) {
        this.labBasico = labBasico;
    }

    public void setLabEspecial(Double labEspecial) {
        this.labEspecial = labEspecial;
    }

    public void setDesigfecBasica(Double desigfecBasica) {
        this.desigfecBasica = desigfecBasica;
    }

    public void setDesigfecAvanzada(Double desigfecAvanzada) {
        this.desigfecAvanzada = desigfecAvanzada;
   }
    public Double getCosto(){
       return costo;
    }   
    public void combo1() {
       if(tipoVehi==1){costo = tipoVehi *25000 + 5000 ;JOptionPane.showMessageDialog(null,"El valor es de: "+costo+"\n"+"Se hizo: Lavado, polichado y desengrasante por debajo"+"\n");}
       if(tipoVehi==2){costo = (tipoVehi-1) *35000 + 5000;JOptionPane.showMessageDialog(null,"El valor es de: "+costo+"\n"+"Se hizo: Lavado, polichado y desengrasante por debajo"+"\n");}
    }
public void combo2() {
       if(tipoVehi==1){costo = tipoVehi * 65000 + 5000 ; JOptionPane.showMessageDialog(null,"El valor es de: "+costo+"\n"+"Se hizo: Lavado, polichado, desengrasante por debajo y"+"\n"+"rafitado de chasis");}
    if(tipoVehi==2){costo = (tipoVehi-1) *35000 + 5000;JOptionPane.showMessageDialog(null,"El valor es de: "+costo+"\n"+"Se hizo: Lavado, polichado, desengrasante por debajo y"+"\n"+"rafitado de chasis");}
    }
public void combo3() {
       if(tipoVehi==1){costo = tipoVehi * 65000 + 15000; JOptionPane.showMessageDialog(null,"El valor es de: "+costo+"\n"+"Se hizo: Lavado, polichado, desengrasante por debajo,"+"\n"+"rafitado de chasis y  tapicer??a \n" +
"(desmontado de sillas para un aseo m??sprofundo)");}
       if(tipoVehi==2){costo = (tipoVehi-1) *75000 + 20000;JOptionPane.showMessageDialog(null,"El valor es de: "+costo+"\n"+"Se hizo: Lavado, polichado, desengrasante por debajo,"+"\n"+"rafitado de chasis y  tapicer??a \n" +
"(desmontado de sillas para un aseo m??sprofundo)");}
    }
public void noComobo(){
int extra=Integer.parseInt(JOptionPane.showInputDialog("Digite el servicio solicitado"+"\n"+"(1) Lavado B??sico:"+"\n"+"(2)Lavado especial:"+"\n"+"(3)Desinfecci??n b??sica:"+"\n"+"(4)Desinfecci??n avanzada:"));
switch (extra){
    case 1: 
      if(tipoVehi==1){JOptionPane.showMessageDialog(null,"El valor es de: 18000"+"\n"+"Se hizo: Lavado B??sico");}
      if(tipoVehi==2){JOptionPane.showMessageDialog(null,"El valor es de: 18000"+"\n"+"Se hizo: Lavado B??sico");}
    break;   
    case 2: 
      if(tipoVehi==1){JOptionPane.showMessageDialog(null,"El valor es de: 27000"+"\n"+"Se hizo: Lavado Avanzado");}
      if(tipoVehi==2){JOptionPane.showMessageDialog(null,"El valor es de: 27000"+"\n"+"Se hizo: Lavado Avanzado");}
    break;  
    case 3: 
      if(tipoVehi==1){JOptionPane.showMessageDialog(null,"El valor es de: 20000"+"\n"+"Se hizo: Desinfecci??n B??sico");}
      if(tipoVehi==2){JOptionPane.showMessageDialog(null,"El valor es de: 20000"+"\n"+"Se hizo: Desinfecci??n     B??sico");}
    break;  
    case 4: 
      if(tipoVehi==1){JOptionPane.showMessageDialog(null,"El valor es de: 18000"+"\n"+"Se hizo: Desinfecci??n Avanzado");}
      if(tipoVehi==2){JOptionPane.showMessageDialog(null,"El valor es de: 18000"+"\n"+"Se hizo: Desinfecci??n Avanzado");}
    break;  
}
}
}
