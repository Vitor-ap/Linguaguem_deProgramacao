package Exercicios_EstruturaSequencial;

/* Bhaskara
Algoritmo_TF03_EX03
DECLARAR.
A, B, C, DELTA, X1, X2: INT;
INICIO.
 LER A, B, C;
 DELTA = ( B * B ) - (4 * A * C);
 X1 = ( -B + Raiz(DELTA) ) / (2 * A);
 X2 = ( -B - Raiz(DELTA) ) / (2 * A);
 ESCREVER X1, X2;
FIM. */

import javax.swing.JOptionPane;
public class exercicio_2 {
public static void main (String argumentos[]) {   
double a, b, c, delta, x1, x2;
a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));
delta = (b * b) - ( 4 * a * c);
x1 = (-b + Math.sqrt(delta)) / (2 * a);
x2 = (-b - Math.sqrt(delta)) / (2 * a);
JOptionPane.showMessageDialog(null, "Valor da primeira raiz é " + x1 + " e o da segunda é " + x2);
}
}
