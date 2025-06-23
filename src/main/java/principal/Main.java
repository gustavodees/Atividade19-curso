package principal;


import javax.swing.*;


public class Main {

    public static void main(String[] args) {


        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int soma = 0;

        while (x != 0) {

            soma += x;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));


        }
       JOptionPane.showMessageDialog(null, "A soma das números até sair do loop é: " + soma);


    }

}