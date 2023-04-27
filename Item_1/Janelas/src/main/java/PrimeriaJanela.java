import javax.swing.*;

public class PrimeriaJanela extends JFrame {
    public PrimeriaJanela(){
        super("Nossa primeira janela");
        setSize(300, 150); //largura (comprimento) e altura
        setVisible(true); }
    
    public static void main(String[] args){
    PrimeriaJanela app = new PrimeriaJanela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}


}

