import javax.swing.JOptionPane;
public class Ex2 {
    public static void main (String [] x){
        int n1, n2, n3, n4, res;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Declare o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Declare o segundo número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Declare o terceiro número:"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Declare o quarto número:"));

        res = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4);

        String s = String.format(
            "A soma dos quadrados dos quatro números é igual a %d",
            res
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
