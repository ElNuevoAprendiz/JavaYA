/*Este es primer ejemplo para la generación de entornos graficos con java
 * con el desarrollo de la pagina java Ya 
 * link: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=30&codigo=103&inicio=20
 */

import javax.swing.*;

public class Formulario1 extends JFrame{

    private JLabel etiqueta;

    public Formulario1(){
        setLayout(null);//En el constructor indicamos que ubicaremos los controles visuales con coordenadas absolutas mediante la desactivación del Layout heredado 
        etiqueta = new JLabel("Hola mundo");
        etiqueta.setBounds(10,20,200,30);
        add(etiqueta);
    }

    public static void main(String[] args) {
        Formulario1 formulario = new Formulario1();
        /*El método setBounds ubica el JFrame (la ventana) en la columna 10, fila 20 con un ancho 
        de 400 píxeles y un alto de 300. 
        
        Debemos llamar al método setVisible y pasarle el valor true 
        para que se haga visible la ventana.
        
        Mediante el método setDefaultCloseOperation y pasando la constante JFrame.EXIT_ON_CLOSE 
        se le indica al JFrame que cuando se presione el botón de cerrado de la ventana proceda a finalizar por completo la aplicación.
         
        */
        formulario.setBounds(10,10,400,300);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}