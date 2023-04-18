package Capitulo4;

import javax.swing.*;
import java.awt.event.*;

public class Salario {
    private String nombre;
    private double salarioHora, horas, salarioTotal;
    private JPanel salarioForm;
    private JLabel lblSalarioHora, lblNombre, lblHorasMes;
    private JTextPane txtSalarioHora, txtNombre, txtHorasMes;
    private JButton btnCalcular, btnLimpiar;

    public Salario() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingEmployeeInfo();
                calcularSalario(salarioHora, horas);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
                txtSalarioHora.setText("");
                txtHorasMes.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Salario");
        f.setContentPane(new Salario().salarioForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void settingEmployeeInfo () {
        this.nombre = txtNombre.getText();
        this.salarioHora = Double.parseDouble(txtSalarioHora.getText());
        this.horas = Double.parseDouble(txtHorasMes.getText());
    }

    public void calcularSalario(double salarioHora, double horas){
        salarioTotal = salarioHora * horas;
        if(salarioTotal > 450000){
            JOptionPane.showMessageDialog(salarioForm, nombre + " su salario mensual es $" + salarioTotal);
        }
        else{
            JOptionPane.showMessageDialog(salarioForm, nombre);
        }
    }
}
