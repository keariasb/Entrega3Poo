package Capitulo5;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class CalculosEnterosPositivos {
    private String listaNumeros;
    private List<String> lista;
    private double raiz;
    private double cuadrado;
    private double cubo;
    private JPanel calculosForm;
    private JTextPane txtListaNumeros;
    private JButton btnCalcular, btnLimpiar;

    public CalculosEnterosPositivos() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularCadaNumero();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListaNumeros.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Cálculos");
        f.setContentPane(new CalculosEnterosPositivos().calculosForm);
        f.pack();
        f.setLocation(600, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void setListaNumeros(){
        this.listaNumeros = txtListaNumeros.getText();
    }

    public void stringToList(String listaNumeros){
        lista = new ArrayList<String>(Arrays.asList(listaNumeros.split(",")));
    }

    public void calcularCadaNumero (){
        setListaNumeros();
        stringToList(listaNumeros);
        for(int i=0; i< lista.size(); i++){
            calcularRaiz(Integer.parseInt(lista.get(i)));
            calcularCuadrado(Integer.parseInt(lista.get(i)));
            calcularCubo(Integer.parseInt(lista.get(i)));
            JOptionPane.showMessageDialog(calculosForm, "Para el número " + lista.get(i) +
                    "\nSu raíz cuadrada es: " + raiz + "\nSu cuadrado es: " + cuadrado + "\nSu cubo es: " + cubo);
        }
    }

    public void calcularRaiz (int x){
        raiz = Math.sqrt(x);
    }

    public void calcularCuadrado (int x){
        cuadrado = Math.pow(x, 2);
    }

    public void calcularCubo (int x){
        cubo = Math.pow(x, 3);
    }
}
