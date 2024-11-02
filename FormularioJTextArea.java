import javax.swing.*;

class FormularioJTextArea extends JFrame {
    private JTextField direccionMail;
    private JScrollPane panelConScroll;
    private JTextArea cuerpoMail;

    public FormularioJTextArea(){

        setLayout(null);

        direccionMail = new JTextField();
        direccionMail.setBounds(10,10,100,30);
        add(direccionMail);

        cuerpoMail = new JTextArea();
        panelConScroll = new JScrollPane(cuerpoMail);
        panelConScroll.setBounds(10,50,100,400);
        add(panelConScroll);



    }
    public static void main(String[] args) {
        
    

    FormularioJTextArea formulario = new FormularioJTextArea();
    formulario.setBounds(0,0,150,500);
    formulario.setVisible(true);
    formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}