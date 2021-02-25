package Exercicios_EstruturaSequencial;

import javax.swing.JOptionPane;
public class exercicio_3 {
public static void main (String argumentos[]) {
double x, y, aux;
// receber o valor de x e y, e trocar esses valores
x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x"));
y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y"));
aux = x;
x = y;
y = aux;
JOptionPane.showMessageDialog(null,"O valor de x é: " + x + " e o valor de y é: " + y);        
}
}
