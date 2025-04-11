import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
    int peso;
    double altura, imc;
        peso = Integer.parseInt(JOptionPane.showInputDialog("coloque seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("coloque sua altura: "));  
            imc = peso/(altura*altura);
            String imc2 = String.format("%.2f", imc);
            JOptionPane.showMessageDialog(null,"O seu indice IMC é: " +imc2);   
    }
}
