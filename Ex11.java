import javax.swing.JOptionPane;

public class Ex11 {
    public static void main (String [] x){
        int carroVendido;
        double salarioFinal, totalVendaCarro, salarioFixo, comissaoFixa;

        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Declare o salario fixo do funcionario:"));
        comissaoFixa = Double.parseDouble(JOptionPane.showInputDialog("Declare a comissao fixa para cada venda:"));
        carroVendido = Integer.parseInt(JOptionPane.showInputDialog("Declare a qtd. de carros vendidos:"));
        totalVendaCarro = Double.parseDouble(JOptionPane.showInputDialog("Declare o valor total das vendas:"));

        salarioFinal = salarioFixo + (comissaoFixa * carroVendido) + (totalVendaCarro * 0.05);

        String s = String.format(
            "O salario final e de %.2f",
            salarioFinal
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
