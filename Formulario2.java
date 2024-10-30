/*Este es segundo ejemplo para la generación de entornos graficos con java
 * con el desarrollo de la pagina java Ya 
 * link: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=30&codigo=103&inicio=20
 * En este ejemplo se trabaja con eventos y el componente buttom
 */


import javax.swing.*;
import java.awt.event.*;


public class Formulario2 extends JFrame implements ActionListener{
    private JButton boton;

    public Formulario2(){
        setLayout(null);
        boton = new JButton("Finaliza");
        boton.setBounds(300,250,100,30);
        add(boton);
        boton.addActionListener(this);
            
        );
    }
}
