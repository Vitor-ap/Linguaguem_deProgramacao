package Exercicios_Estrutura_deDecisao;

/* 
Receba 2 valores inteiros. Calcule e mostre o resultado da   diferença do maior pelo menor valor.

Pseudocódigo

Declarar.
valor1, valor2, resultado: inteiro;
Inicio.
	Ler valor1, valor2;
	Se (valor1 >= valor2) então
		resultado = valor1 -  valor2;
	Senão
		resultado = valor2 – valor1;
	Fim-se;
Mostrar resultado;

Teste de mesa: 

Massa de dados        Saída:
4,4                    0
5,3                    2
4,5                    1
*/

import javax.swing.JOptionPane;


public class ATIV2_EXERCICIO1 {
   public static void main  (String args[]) {
   int valor1, valor2, resultado;
   valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
   valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
    if (valor1 >= valor2) {
    resultado = valor1 - valor2;
    } // do if
    else {
    resultado = valor2 - valor1;
    } // do else
       JOptionPane.showMessageDialog(null, "O resultado é: " +resultado);
   } // public static
    
} //public class
