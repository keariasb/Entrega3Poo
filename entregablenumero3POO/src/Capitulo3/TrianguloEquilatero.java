package Capitulo3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianguloEquilatero {
    private JPanel TrianguloEquilateroForm;
    private JLabel lblLado;
    private JTextPane txtLado;
    private JButton btnCalcular;
    private JButton btnLimpiar;

    private double Lado;

    public TrianguloEquilatero(){
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                calcularTrianguloEquilatero(Lado);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLado.setText("");

            }
        });
    }
    public void loadForm(){
        JFrame f = new JFrame("Empleado");
        f.setContentPane(new TrianguloEquilatero().TrianguloEquilateroForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);

    }
    public void settingInfo(){
        this.Lado = Double.parseDouble(txtLado.getText());

    }

    public void calcularTrianguloEquilatero(double Lado){
        JOptionPane.showMessageDialog(TrianguloEquilateroForm,"El perimetro del triangulo es "+ (3*Lado)+ "\nLa altura del triangulo es "+ ((Lado* Math.sqrt(3))/2)+ "\nEl area del triangulo es "+ ((Math.pow(Lado, 2) * Math.sqrt(3))/4));
    }
}
