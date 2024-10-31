/*Este es segundo ejemplo para la generación de entornos graficos con java
 * con el desarrollo de la pagina java Ya 
 * link: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=30&codigo=103&inicio=20
 * En este ejemplo se trabaja con eventos y el componente buttom
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Formulario2 extends JFrame implements ActionListener{
    private JButton boton;

    public Formulario2(){
        setLayout(null);
        boton = new JButton("Finaliza");
        boton.setBounds(300,250,100,30);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==boton){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Formulario2 formulario2 = new Formulario2();
        formulario2.setBounds(0,0,450,300);
        formulario2.setVisible(true);
        formulario2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
