import javax.swing.JOptionPane;

public class novoSalario {
    public static void main (String [] x){
        double salarioAtual, percReajuste, salarioRecal;

        salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Declare o salario atual do funcionario:"));
        percReajuste = Double.parseDouble(JOptionPane.showInputDialog("Declare o reajuste salarial:"));

        salarioRecal = salarioAtual * percReajuste;

        String s = String.format(
            "O novo salario e de %.2f",
            salarioRecal
        );

        JOptionPane.showMessageDialog(null, s);
    }
}

