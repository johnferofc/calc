package br.com.john.calc.vision;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Calc extends JFrame {

    public Calc(){

        organizarLayout();
        setSize(232, 232);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233,60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calc();
    }
}
