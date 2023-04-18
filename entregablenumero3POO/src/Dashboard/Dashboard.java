package Dashboard;

import Capitulo3.*;
import Capitulo4.*;
import Capitulo5.*;
import FigurasGeometricas.DashboardFiguras;

import javax.swing.*;
import java.awt.event.*;

public class Dashboard {
    private JPanel dashboardForm;
    private JButton btnCirculo, btnEjercicio19, btnEjercicio7, btnEjercicio10, btnEjercicio22;
    private JButton btnEjercicio23, btnEjercicio40, btnEjercicio41;
    private JButton btnDashboardFiguras;

    public Dashboard() {
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Empleado empleado = new Empleado();
                empleado.loadForm();
            }
        });
        btnEjercicio19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrianguloEquilatero miTriangulo = new TrianguloEquilatero();
                miTriangulo.loadForm();
            }
        });
        btnEjercicio7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComparadorAB comparador = new ComparadorAB();
                comparador.loadForm();
            }
        });
        btnEjercicio10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Matricula matricula = new Matricula();
                matricula.loadForm();
            }
        });
        btnEjercicio22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Salario salario = new Salario();
                salario.loadForm();
            }
        });
        btnEjercicio23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormulaCuadratica cuadratica = new FormulaCuadratica();
                cuadratica.loadForm();
            }
        });
        btnEjercicio40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculosEnterosPositivos calculo = new CalculosEnterosPositivos();
                calculo.loadForm();
            }
        });
        btnEjercicio41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MayorValorLista mayor = new MayorValorLista();
                mayor.loadForm();
            }
        });
        btnDashboardFiguras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DashboardFiguras dashboardFiguras = new DashboardFiguras();
                dashboardFiguras.loadForm();
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Menú principal");
        f.setContentPane(new Dashboard().dashboardForm);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }
}
