package Exercicios_EstruturaSequencial;


import javax.swing.JOptionPane;
// 1.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
public class exercicio_1 {
 public static void main (String argumentos[]) {
 double c, f;
 c = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em graus Celcius"));
 f = ( 9 * c + 160) / 5;
 JOptionPane.showMessageDialog(null,"A tempetarua em Farenheit é " + f + " graus");
 }
}
