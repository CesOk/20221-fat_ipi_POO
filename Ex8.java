import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String [] x){
        int vTotal, vNulo, vValido, vBranco;
        double percNulo, percValido, percBranco;

        vTotal = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de votos totais:"));
        vNulo = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de votos nulos:"));
        vValido = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de votos validos:"));
        vBranco = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de votos brancos:"));

        percNulo = ((double)vNulo/vTotal)*100;
        percValido = ((double)vValido/vTotal)*100;
        percBranco = ((double)vBranco/vTotal)*100;

        String s = String.format(
            "%.2f por cento sao votos nulos\n%.2f por cento sao votos validos\n%.2f por cento sao votos brancos",
            percNulo,
            percValido,
            percBranco
        );

        JOptionPane.showMessageDialog(null, s);
    }
}
