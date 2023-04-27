package com.mycompany.janela_centralizada;
import javax.swing.*;

public class Janela_Centralizada extends JFrame {
    
    public Janela_Centralizada(){
    
        super("Janela Centralizada");
        setSize(300,150);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String []args){
        Janela_Centralizada app = new Janela_Centralizada ();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
