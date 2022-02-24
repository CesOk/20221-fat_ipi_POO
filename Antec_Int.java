import javax.swing.JOptionPane;
public class Antec_Int {
    public static void main (String [] x){
        int num_atual, num_antc;

        num_atual = Integer.parseInt(JOptionPane.showInputDialog("Declare um número inteiro:"));

        num_antc = num_atual - 1;

        String s = String.format(
            "O antecessor do seu número é %d",
            num_antc
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
