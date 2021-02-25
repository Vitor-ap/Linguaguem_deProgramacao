package Exercicios_Estrutura_deDecisao;

/* 
Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.

Pseudocódigo

Declarar.
	valor1, valor2, valor3, valor4: real;
Inicio.
Leia valor1, valor2, valor3, valor4
	Se (valor4 <= valor1) então
Escreva valor4, valor1, Valor2, valor3;
	Senão
		Se (valor4 <= valor2 E >= valor1) então	
			Escreva valor1, valor4, valor2, valor3
Senão
			Se (Valor4 <= valor3 E >=valor2) então
				Escreva valor1, valor2, valor4, valor3
			Senão
				Escreva valor1, valor2, valor3, valor4
			Fim se;	// do valor4 <=valor2 e >= valor1
		Fim-se; // do valor4 <=valor3 e >=valor2
	Fim-se; // do valor4 <= valor3 e >=valor2

Teste de mesa:

Massa de dados   Saídas:
10,20,30,9  	9,10,20,30
10,20,30,15	10,15,20,30
10,20,30,25	10, 20, 25, 30
10,20,30,35	10,20,30,35
10,20,30,10	10, 10, 20, 30
*/
import javax.swing.JOptionPane;

public class ATIV2_EXERCICIO2 {
    public static void main (String args[]){
float valor1, valor2, valor3, valor4;
  valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor"));
  valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
  valor3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro valor"));
  valor4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o quarto valor"));
        if (valor4 <= valor1) {
        JOptionPane.showMessageDialog(null,valor4+", "+valor1+ ", "+ valor2+", "+ valor3);
        }
        else {
          if (valor4 <= valor2 && valor4 >= valor1){ 
             JOptionPane.showMessageDialog(null,valor1+", "+valor4+ ", "+ valor2+", "+ valor3);
                }
        else {
               if (valor4 <= valor3 && valor4 >= valor2) {
                 JOptionPane.showMessageDialog(null,valor1+", "+valor2+ ", "+ valor4+", "+ valor3);
                }
        else {
                JOptionPane.showMessageDialog(null,valor1+", "+valor2+ ", "+ valor3+", "+ valor4);
                }
        }
    }
  }
}
