package Capitulo5;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.stream.Collectors;

public class MayorValorLista {
    private String listaNumeros;
    private List<Integer> lista;
    private List<Integer> listaOrdenada;
    private double mayor;
    private JPanel mayorForm;
    private JTextPane txtListaNumeros;
    private JButton btnCalcular, btnLimpiar;

    public MayorValorLista() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularNumeroMayor();
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
        JFrame f = new JFrame("Número mayor");
        f.setContentPane(new MayorValorLista().mayorForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void setListaNumeros(){
        this.listaNumeros = txtListaNumeros.getText();
    }

    public void stringToList(String listaNumeros){
        lista = Arrays.stream(listaNumeros.split(",")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public void ordenarLista(){
        Collections.sort(lista);
    }

    public void calcularNumeroMayor(){
        setListaNumeros();
        stringToList(listaNumeros);
        ordenarLista();
        JOptionPane.showMessageDialog(mayorForm, "El número mayor es: " + lista.get(lista.size() - 1));
    }
}
