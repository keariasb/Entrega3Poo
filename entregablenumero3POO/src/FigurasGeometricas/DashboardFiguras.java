package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class DashboardFiguras {
    private JPanel dashboardFigForm;
    private JButton btnCirculo, btnRectangulo, btnCuadrado, btnTrianguloRectangulo, btnRombo, btnTrapecio;

    public DashboardFiguras() {
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circulo circulo = new Circulo(2);
                circulo.loadForm();
            }
        });
        btnRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rectangulo rectangulo = new Rectangulo(1, 2);
                rectangulo.loadForm();
            }
        });
        btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cuadrado cuadrado = new Cuadrado(3);
                cuadrado.loadForm();
            }
        });
        btnTrianguloRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(3, 5);
                trianguloRectangulo.loadForm();
            }
        });
        btnRombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rombo rombo = new Rombo(5,8,4);
                rombo.loadForm();
            }
        });
        btnTrapecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Trapecio trapecio = new Trapecio(15,12,6);
                trapecio.loadForm();
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Menú figuras geométricas");
        f.setContentPane(new DashboardFiguras().dashboardFigForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }
}
