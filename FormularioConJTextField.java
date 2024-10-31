import javax.swing.*;
import java.awt.event.*;

public class FormularioConJTextField extends JFrame implements ActionListener{
    private JButton boton;
    private JTextField texto;
    private JLabel etiqueta;

    public FormularioConJTextField(){
        setLayout(null);

        boton = new JButton("Aceptar");
        boton.setBounds(10,80,100,30);
        add(boton);
        boton.addActionListener(this);

        etiqueta = new JLabel("Usuario");
        etiqueta.setBounds(10,10,100,30);
        add(etiqueta);

        texto = new JTextField();
        texto.setBounds(120,10,150,20);
        add(texto);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==boton){
            setTitle(texto.getText());
        }
    }

    public static void main(String[] args){
        FormularioConJTextField formulario = new FormularioConJTextField();
        formulario.setBounds(0,0,350,170);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}