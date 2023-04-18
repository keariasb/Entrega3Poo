package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class Cuadrado {
    int lado;
    private JTextPane txtLado, txtArea, txtPerimetro;
    private JButton btnCalcular, btnLimpiar;
    private JPanel cuadradoForm;

    public Cuadrado(int lado) {
        this.lado = lado;
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                calcularArea();
                calcularPerimetro();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLado.setText("");
                txtArea.setText("");
                txtPerimetro.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Cuadrado");
        f.setContentPane(new Cuadrado(5).cuadradoForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo(){
        this.lado = Integer.parseInt(txtLado.getText());
    }

    private void calcularArea() {
        txtArea.setText(String.valueOf(lado*lado));
    }

    private void calcularPerimetro() {
        txtPerimetro.setText(String.valueOf(4*lado));
    }

    double getArea(){
        return Double.parseDouble(String.valueOf(lado*lado));
    }

    double getPerimetro(){
        return Double.parseDouble(String.valueOf(4*lado));
    }
}

