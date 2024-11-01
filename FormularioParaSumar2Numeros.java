import javax.swing.*;
import java.awt.event.*;


public class FormularioParaSumar2Numeros extends JFrame implements ActionListener{
    private JTextField texto1, texto2;
    private JButton boton;
    private JLabel resultado;

    public FormularioParaSumar2Numeros(){
        setLayout(null);

        texto1 = new JTextField();
        texto1.setBounds(10,10,100,30);
        add(texto1);

        texto2 = new JTextField();
        texto2.setBounds(10,50,100,30);
        add(texto2);

        boton = new JButton("Sumar");
        boton.setBounds(10,90,100,30);
        add(boton);
        boton.addActionListener(this);

        resultado = new JLabel("Resultado");
        resultado.setBounds(120, 50, 100, 30);
        add(resultado);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==boton){
            int suma = (Integer.parseInt(texto1.getText()))+(Integer.parseInt(texto2.getText()));
            //setTitle(String.valueOf(suma));
            resultado.setText("Resultado "+ suma);
        }
    }

    public static void main(String[] args) {
        FormularioParaSumar2Numeros formulario = new FormularioParaSumar2Numeros();
        formulario.setBounds(0,0,240,170);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
