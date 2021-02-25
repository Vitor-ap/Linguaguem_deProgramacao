package Exercicios_EstruturaSequencial;

// Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
import javax.swing.JOptionPane; 
public class exercicio_4 {
 public static void main (String Argumentos[]){    
 int ano_nasc, ano_atual, idade, idade_futuro;
 ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
 ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
 idade = ano_atual - ano_nasc;
 idade_futuro = idade + 17;
 JOptionPane.showMessageDialog(null,"A sua idade atual é " + idade + " e daqui a 17 anos você terá " + idade_futuro + " anos.");
}
}