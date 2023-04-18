package Capitulo4;

import javax.swing.*;
import java.awt.event.*;

public class Matricula {

    private String numeroInscripcion, nombre;
    private  double patrimonio, estrato, matricula;
    private JPanel matriculaForm;
    private JLabel lblNumeroInscripcion, lblNombre, lblPatrimonio, lblEstrato;
    private JTextPane txtNumeroInscripcion, txtNombre, txtPatrimonio, txtEstrato;
    private JButton btnCalcular, btnLimpiar;

    public Matricula() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                calcularMatricula(estrato, patrimonio);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
                txtNumeroInscripcion.setText("");
                txtEstrato.setText("");
                txtPatrimonio.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Matrícula");
        f.setContentPane(new Matricula().matriculaForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void settingInfo(){
        this.numeroInscripcion = txtNumeroInscripcion.getText();
        this.nombre = txtNombre.getText();
        this.estrato = Double.parseDouble(txtEstrato.getText());
        this.patrimonio = Double.parseDouble(txtPatrimonio.getText());
        this.matricula = 50000;
    }

    public void calcularMatricula (double estrato, double patrimonio){
        if ((patrimonio > 2000000) && (estrato > 3)) {
            matricula += 0.03 * patrimonio;
        }
        JOptionPane.showMessageDialog(matriculaForm,"El estudiante " + nombre + " con numero de inscripción " + numeroInscripcion +
                " \ndebe pagar: $" + matricula);
    }
}
