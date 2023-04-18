package Capitulo3;

import Capitulo4.Matricula;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Empleado {
    private JPanel EmpleadoForm;
    private JLabel lblCodigo;
    private JTextPane txtCodigo;
    private JLabel lblNombres;
    private JTextPane txtNombres;
    private JLabel lblHorasT;
    private JTextPane txtHorasT;
    private JLabel lblValorH;
    private JTextPane txtValorH;
    private JLabel lblRetefuente;
    private JTextPane txtRetefuente;
    private JButton btnCalcular;
    private JButton btnLimpiar;

    private String Codigo, Nombres;

    private double HorasT, ValorH, Retefuente;

    public Empleado(){
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            settingInfo();
            calcularEmpleado(HorasT,ValorH,Retefuente);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigo.setText("");
                txtNombres.setText("");
                txtHorasT.setText("");
                txtValorH.setText("");
                txtRetefuente.setText("");
            }
        });
    }
    public void loadForm(){
        JFrame f = new JFrame("Empleado");
        f.setContentPane(new Empleado().EmpleadoForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);

    }
    public void settingInfo(){
        this.Codigo = txtCodigo.getText();
        this.Nombres = txtNombres.getText();
        this.HorasT = Double.parseDouble(txtHorasT.getText());
        this.ValorH = Double.parseDouble(txtValorH.getText());
        this.Retefuente = Double.parseDouble(txtRetefuente.getText());
    }

    public void calcularEmpleado(double HorasT, double ValorH, double Retefuente){
        JOptionPane.showMessageDialog(EmpleadoForm,"El empleado identificado con codigo " + Codigo + ", llamado " + Nombres + "\ntiene un salario bruto de " + (HorasT*ValorH) + "\nY tiene un salario neto de " + (((HorasT*ValorH)*Retefuente)/100));
    }
}
