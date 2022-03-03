import javax.swing.JOptionPane;
public class Ex5 {
    public static void main (String [] x){
        double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Declare a base do retângulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Declare a altura do retângulo:"));

        area = base * altura;

        String s = String.format(
            "A area do retângulo é de %.2f",
            area
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
