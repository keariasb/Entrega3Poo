package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class Rombo {
    int lado;
    int diametroMayor;
    int diametroMenor;
    private JPanel romboForm;
    private JTextPane txtArea, txtLado, txtPerimetro, txtDiametroMayor, txtDiametroMenor;
    private JButton btnCalcular, btnLimpiar;

    public Rombo(int lado, int diametroMayor, int diametroMenor) {
        this.lado = lado;
        this.diametroMayor = diametroMayor;
        this.diametroMenor = diametroMenor;
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
                txtArea.setText("");
                txtLado.setText("");
                txtPerimetro.setText("");
                txtDiametroMayor.setText("");
                txtDiametroMenor.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Rombo");
        f.setContentPane(new Rombo(5,8,4).romboForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo(){
        this.lado = Integer.parseInt(txtLado.getText());
        this.diametroMayor = Integer.parseInt(txtDiametroMayor.getText());
        this.diametroMenor = Integer.parseInt(txtDiametroMenor.getText());
    }

    private void calcularArea() {
        txtArea.setText(String.valueOf((diametroMayor * diametroMenor) / 2.0));
    }

    private void calcularPerimetro() {
        txtPerimetro.setText(String.valueOf(4*lado));
    }

    double getArea(){
        return Double.parseDouble(String.valueOf((diametroMayor * diametroMenor) / 2.0));
    }

    double getPerimetro(){
        return Double.parseDouble(String.valueOf(4*lado));
    }
}
