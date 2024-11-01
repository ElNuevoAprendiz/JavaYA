import java.awt.event.*;
import javax.swing.*;

public class FormularioJComboBox extends JFrame implements ItemListener {
    private JComboBox<String> combo;

    public FormularioJComboBox(){
        setLayout(null);

        combo = new JComboBox<String>();
        combo.setBounds(10,10,80,20);
        add(combo);
        combo.addItem("Rojo");
        combo.addItem("Verde");
        combo.addItem("Azul");
        combo.addItem("Blanco");
        combo.addItemListener(this);

    } 

    public void itemStateChanged(ItemEvent e){
        if (e.getSource()==combo){
            setTitle((String)combo.getSelectedItem());
        }
    }

    public static void main(String[] args){
        FormularioJComboBox formulario = new FormularioJComboBox();
        formulario.setBounds(0,0,200,150);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
