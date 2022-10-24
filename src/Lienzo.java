/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Mazas
 */
public class Lienzo extends JPanel{
    Metodos met = new Metodos(); 
    
    @Override
    public void paint(Graphics g){
        //Metodos rot = new Metodos();
        //double []rotacion = rot.Rotacion(50, 2 , 3);
        super.paint(g);
        /*Nota personal para los puntos en Y hay que invertir el signo*/
        g.drawLine(350, 0, 350, 700);
        g.drawLine(0, 350, 700, 350);
        int origenX = 350;
        int origenY = 350;
        
        g.setColor(Color.blue);
        g.drawLine((origenX + Integer.parseInt(py1.getText())), (origenY - Integer.parseInt(py2.getText())),
                (origenX + Integer.parseInt(py1.getText())),
                (origenY - Integer.parseInt(py2.getText())));
                g.drawOval((origenX + Integer.parseInt(py1.getText()))-2, (origenY - Integer.parseInt(py2.getText()))-3, 5, 5);

        if(!aux1.getText().isEmpty()){
        g.setColor(Color.red);
        g.drawLine((origenX + Integer.parseInt(aux1.getText())), (origenY - Integer.parseInt(aux2.getText())),
                (origenX + Integer.parseInt(aux1.getText())),
                (origenY - Integer.parseInt(aux2.getText())));
        g.drawOval((origenX + Integer.parseInt(aux1.getText()))-2, (origenY - Integer.parseInt(aux2.getText()))-3, 5, 5);
        
        }
        if(!aux3.getText().isEmpty()){
        g.setColor(Color.red);
        g.drawLine((origenX + Integer.parseInt(aux3.getText())), (origenY - Integer.parseInt(aux4.getText())),
                (origenX + Integer.parseInt(aux3.getText())),
                (origenY - Integer.parseInt(aux4.getText())));
        g.drawOval((origenX + Integer.parseInt(aux3.getText()))-2, (origenY - Integer.parseInt(aux4.getText()))-3, 5, 5);
        }
        if(!aux5.getText().isEmpty()){

        g.setColor(Color.red);
        g.drawLine((origenX + Integer.parseInt(aux5.getText())), (origenY - Integer.parseInt(aux6.getText())),
                (origenX + Integer.parseInt(aux5.getText())),
                (origenY - Integer.parseInt(aux6.getText())));
        g.drawOval((origenX + Integer.parseInt(aux5.getText()))-2, (origenY - Integer.parseInt(aux6.getText()))-3, 5, 5);

        }
    }
    
     public void Art(){
         
        JFrame ventana = new JFrame();
        Lienzo obj = new Lienzo();
        ventana.add(obj);
        ventana.setSize(700,700);
        ventana.setTitle("GRAFICACION");
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        // cosas para obtener datos de rotacion
        
            py1 = new javax.swing.JTextField();
            ventana.add(py1);
            py1.setVisible(false);
            
            py2 = new javax.swing.JTextField();
            ventana.add(py2);
            py2.setVisible(false);
            
        //aux para rotacion
            aux1 = new javax.swing.JTextField();
            ventana.add(aux1);
            aux1.setVisible(false);
            aux2 = new javax.swing.JTextField();
            ventana.add(aux2);
            aux2.setVisible(false);
        
        //para traslacion
            pz1 = new javax.swing.JTextField();
            ventana.add(pz1);
            pz1.setVisible(false);
            
            pz2 = new javax.swing.JTextField();
            ventana.add(pz2);
            pz2.setVisible(false);
            
            aux3 = new javax.swing.JTextField();
            ventana.add(aux3);
            aux3.setVisible(false);
            aux4 = new javax.swing.JTextField();
            ventana.add(aux4);
            aux4.setVisible(false);
        
        
        //para proyeccion
            px1 = new javax.swing.JTextField();
            ventana.add(px1);
            px1.setVisible(false);
            
            px2 = new javax.swing.JTextField();
            ventana.add(px2);
            px2.setVisible(false);
            
            aux5 = new javax.swing.JTextField();
            ventana.add(aux5);
            aux5.setVisible(false);
            aux6 = new javax.swing.JTextField();
            ventana.add(aux6);
            aux6.setVisible(false);
        }
     public static javax.swing.JTextField py1;
     public static javax.swing.JTextField py2;
     public static javax.swing.JTextField pz1;
     public static javax.swing.JTextField pz2;
     public static javax.swing.JTextField px1;
     public static javax.swing.JTextField px2;
     public static javax.swing.JTextField aux1;
     public static javax.swing.JTextField aux2;
     public static javax.swing.JTextField aux3;
     public static javax.swing.JTextField aux4;
     public static javax.swing.JTextField aux5;
     public static javax.swing.JTextField aux6;
}
