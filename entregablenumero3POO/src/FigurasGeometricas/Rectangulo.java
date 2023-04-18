package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class Rectangulo {
    int base;
    int altura;
    private JPanel rectanguloForm;
    private JTextPane txtBase, txtPerimetro, txtArea, txtAltura;
    private JButton btnCalcular, btnLimpiar;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
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
                txtBase.setText("");
                txtArea.setText("");
                txtAltura.setText("");
                txtPerimetro.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Rectángulo");
        f.setContentPane(new Rectangulo(1,2).rectanguloForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo(){
        this.base = Integer.parseInt(txtBase.getText());
        this.altura = Integer.parseInt(txtAltura.getText());
    }

    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     * Área de un rectángulo
     */
    private void calcularArea() {
        txtArea.setText(String.valueOf(base * altura));
    }
    /**
     * Método que calcula y devuelve el perímetro de un rectángulo
     * como (2 * base) + (2 * altura)
     * Perímetro de un rectángulo
     */
    private void calcularPerimetro() {
       txtPerimetro.setText(String.valueOf((2 * base) + (2 * altura)));
    }

    double getArea(){
        return Double.parseDouble(String.valueOf(base * altura));
    }

    double getPerimetro(){
        return Double.parseDouble(String.valueOf((2 * base) + (2 * altura)));
    }
}

