import javax.swing.JOptionPane;

public class Ex6 {
    public static void main (String [] x){
        int anos, dias;

        anos = Integer.parseInt(JOptionPane.showInputDialog("Declare sua idade:"));

        dias = anos*365;

        String s = String.format(
            "A sua idade equivale a %d dias",
            dias
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
