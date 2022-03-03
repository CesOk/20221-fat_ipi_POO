import javax.swing.JOptionPane;

public class Ex10 {
    public static void main (String [] x){
        double CustFbr, CustDtr, CustImp, CustFinal;

        CustDtr = 1.28;
        CustImp = 1.45;
        
        CustFbr = Double.parseDouble(JOptionPane.showInputDialog("Declare o custo do carro:"));

        CustFinal = CustFbr + (CustFbr * CustDtr) + (CustFbr * CustImp);

        String s = String.format(
            "O custo final do carro e %.2fR$",
            CustFinal
        );


        JOptionPane.showMessageDialog(null, s);
    }
}
