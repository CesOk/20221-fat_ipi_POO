import javax.swing.JOptionPane;
public class Dolar {
    public static void main (String [] x){
        double Dol, Real;
        int Qt_Dol;

        Dol = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar atualmente:"));
        Qt_Dol = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dólares a converter:"));

        Real = Dol * Qt_Dol;

        String s = String.format(
            "Dólar atualmente: %.2f",
            Real
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
