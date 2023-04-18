package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class Circulo {
    int radio; // Atributo que define el radio de un círculo
    private JPanel circuloForm;
    private JTextPane txtRadio, txtPerimetro, txtArea;
    private JButton btnCalcular, btnLimpiar;

    Circulo(int radio) {
        this.radio = radio;
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularArea();
                calcularPerimetro();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
                txtRadio.setText("");
                txtPerimetro.setText("");
            }
        });
    }
    public void loadForm(){
        JFrame f = new JFrame("Círculo");
        f.setContentPane(new Circulo(3).circuloForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void setRadio(){
        this.radio = Integer.parseInt(txtRadio.getText());
    }

    private void calcularArea() {
        setRadio();
        txtArea.setText(String.format("%.3f",Math.PI*Math.pow(radio,2)));
    }

    void calcularPerimetro() {
        setRadio();
        txtPerimetro.setText(String.format("%.3f",2*Math.PI*radio));
    }

    double getArea(){
        return Double.parseDouble(String.valueOf(Math.PI*Math.pow(radio,2)));
    }

    double getPerimetro(){
        return Double.parseDouble(String.valueOf(Math.PI*Math.pow(radio,2)));
    }
}