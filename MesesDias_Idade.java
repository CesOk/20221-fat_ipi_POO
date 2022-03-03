import javax.swing.JOptionPane;
public class MesesDias_Idade {
    public static void main (String [] x){
        int anos, meses, dias;

        anos = Integer.parseInt(JOptionPane.showInputDialog("Declare sua idade:"));

        dias = anos*365;

        meses = dias/30;

        String s = String.format(
            "A sua idade equivale a %d dias, logo sendo %d meses",
            dias, meses
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
