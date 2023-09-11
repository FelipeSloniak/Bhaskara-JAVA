import javax.swing.*;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException{

        double a,b,c,delta,x1,x2;
        String A = JOptionPane.showInputDialog("Digite o Valor de A:");
        a = Double.parseDouble(A);
        String B = JOptionPane.showInputDialog("Digite o Valor de B:");
        b = Double.parseDouble(B);
        String C = JOptionPane.showInputDialog("Digite o Valor de C:");
        c = Double.parseDouble(C);

        delta = Math.pow(b,2) - 4*a*c;
        if (delta<0){
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        JOptionPane.showMessageDialog(null, "O Valor da raiz 1 é igual á: " + x1 + "\n" +
                "O valor da raiz 2 é igual à: " + x2 + "\n" +
                "O Delta é igual à: " + delta);

    }
}
