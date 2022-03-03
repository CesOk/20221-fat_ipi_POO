import javax.swing.JOptionPane;
public class Comissao {
    public static void main (String [] x){
        double pgmt, preco_unit;
        int qt_vend;

        preco_unit = Double.parseDouble(JOptionPane.showInputDialog("Declare o valor unitario da peca vendida:"));
        qt_vend = Integer.parseInt(JOptionPane.showInputDialog("Declare a quantidade de pecas vendidas:"));

        pgmt = preco_unit * qt_vend;

        String s = String.format(
            "A comissao a ser paga para o vendedor e de %.2fR$",
            pgmt
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
