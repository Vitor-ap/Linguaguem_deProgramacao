package Exercicios_EstruturaSequencial;

/*Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
Receber o tempo de percurso e a velocidade média.
Algoritmo TF_02_EX02
  Declarar.
    Tempo, Vm, distância, consumo: real;
   Inicio.
     // Ler Tempo, Vm;
      //distância = (Tempo * Vm);
      //consumo = (distância / 12);
      //Mostrar consumo;
   Fim.
*/
import javax.swing.JOptionPane;
public class exercicio_6 {
public static void main (String argumentos[]){
double tempo, vm, distancia, consumo;
tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do percurso (em horas)"));
vm = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média (Km/h"));
distancia = tempo * vm;
consumo = distancia / 12;
JOptionPane.showMessageDialog(null, "O consumo será de: " + consumo + " litros.");
}
}