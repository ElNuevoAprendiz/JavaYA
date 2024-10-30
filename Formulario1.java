/*Este es primer ejemplo para la generación de entornos graficos con java
 * con el desarrollo de la pagina java Ya 
 * link: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=30&codigo=103&inicio=20
 */

import javax.swing.*;

public class Formulario1 extends JFrame{

    private JLabel etiqueta;

    public Formulario1(){
        setLayout(null);
        etiqueta = new JLabel("Hola mundo");
        etiqueta.setBounds(10,20,200,30);
        add(etiqueta);
    }

    public static void main(String[] args) {
        Formulario1 formulario = new Formulario1();
        formulario.setBounds(10,10,400,300);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}