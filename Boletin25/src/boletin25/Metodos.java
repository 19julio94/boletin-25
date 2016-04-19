
package boletin25;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JP
 */
public class Metodos implements ActionListener {
    JFrame marco ;
    JPanel panel;
    JButton boton ;
    JLabel etiqueta;
     public void crearVentana(){
     marco = new JFrame(" Boletin 25 ");
     panel = new JPanel();
     boton = new JButton(" Preme");
     etiqueta = new JLabel();
     
     marco.setSize(400, 300);
     panel.setSize(200, 200);
     boton.setSize(50,50);
     boton.setBackground(Color.green);
     panel.add(boton);
     panel.add(etiqueta);
     marco.add(panel);
     boton.addActionListener(this);
     
     
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     marco.setVisible(true);     
    
    
    }  

    @Override
    public void actionPerformed(ActionEvent ae) {
        etiqueta.setText("**--Premiches o boton--** ");
    }
}
