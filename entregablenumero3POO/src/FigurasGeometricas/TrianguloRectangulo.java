package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class TrianguloRectangulo {
    int base;
    int altura;
    private JPanel trianguloRectanguloForm;
    private JTextPane txtBase, txtAltura, txtPerimetro, txtArea;
    private JButton btnCalcular, btnLimpiar;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                calcularArea();
                calcularPerimetro();
                determinarTipoTriangulo();
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
        JFrame f = new JFrame("Triángulo rectángulo");
        f.setContentPane(new TrianguloRectangulo(3,5).trianguloRectanguloForm);
        f.pack();
        f.setLocation(400, 65);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo(){
        this.base = Integer.parseInt(txtBase.getText());
        this.altura = Integer.parseInt(txtAltura.getText());
    }

    private void calcularArea() {
        txtArea.setText(String.valueOf(base * altura / 2));
    }

    private void calcularPerimetro() {
        txtPerimetro.setText(String.valueOf(base + altura + calcularHipotenusa()));
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa()))
            JOptionPane.showMessageDialog(trianguloRectanguloForm,"Es un triángulo equilátero");
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa()))
            JOptionPane.showMessageDialog(trianguloRectanguloForm,"Es un triángulo escaleno");
        else
            JOptionPane.showMessageDialog(trianguloRectanguloForm,"Es un triángulo isósceles");
    }

    double getArea(){
        return Double.parseDouble(String.valueOf(base * altura / 2));
    }

    double getPerimetro(){
        return Double.parseDouble(String.valueOf(base + altura + calcularHipotenusa()));
    }
}


