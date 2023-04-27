import javax.swing.*;

public class Tamanho_Fixo extends JFrame {
    public Tamanho_Fixo(){
        super("Uma janela não dimensionável");
        setResizable(false);
        setSize(300,150);
        setVisible(true);
    }

        public static void main(String[]args){
            Tamanho_Fixo app = new Tamanho_Fixo();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
