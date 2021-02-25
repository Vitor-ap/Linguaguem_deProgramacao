package Exercicios_Estrutura_deDecisao;

/* Receba o código correspondente ao cargo de um funcionário e seu salário atual e 
mostre a descrição do cargo, e o valor do seu novo salário. 
Os cargos estão na tabela. (Utilizar estrutura escolha... caso).

1 - Esciturário 50%
2 - Secretário 35%
3 - Caixa 20%
4 - Gerente 10 %
outros - "Não há cargo"

Pseudocódigo 

Declarar
	Cod: inteiro;
	salario, novo_salario: real;
Inicio.
Ler cod, salario;
Escolha cod
Caso 1: novo_salario = salario + (salario * 0,5)
	Mostrar (“Seu novo Cargo é Escriturário e seu salário será”, novo_salario , “ reais”);
Caso 2: novo_salario = salario + (salario * 0,35)
	Mostrar (“Seu novo Cargo é Secretário e seu salário será”, novo_salario , “ reais”);
Caso 3: novo_salario = salario + (salario * 0,20)
	Mostrar (“Seu novo Cargo é Caixa e seu salário será”, novo_salario , “ reais”);
Caso 4: novo_salario = salario + (salario * 0,10)
	Mostrar (“Seu novo Cargo é Gerente e seu salário será”, novo_salario , “ reais”);
Caso contrário: Mostrar (“Não há cargo”)
Fimescolha

Teste de mesa:

Massa de dados			Saída
1, 1000			Seu novo Cargo é Escriturário e seu salário será 1500 reais
2, 1000			Seu novo Cargo é Secretário e seu salário será 1350 reais
3, 1000			Seu novo Cargo é Caixa e seu salário será 1200 reais
4, 1000			Seu novo Cargo é gerente e seu salário será 1100 reais
5, 1000			Não há cargo

*/
import javax.swing.JOptionPane;

public class ATIV2_EXERCICIO3 {
public static void main (String args[]) {
    int cod;
    double salario, novo_salario;
    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cargo:\n\n1- Ecriturário\n2 - Secretário\n3 - Caixa\n4 - Gerente"));
    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Salário atual"));
        switch (cod) {
        case 1: 
            novo_salario = salario + (salario * 0.5);
            JOptionPane.showMessageDialog(null,"Seu novo cargo é Escriturário e seu salário será R$ " +novo_salario+ ".");
            break;
        case 2:     
            novo_salario = salario + (salario * 0.35);
            JOptionPane.showMessageDialog(null,"Seu novo cargo é Secretário e seu salário será R$ " +novo_salario+ ".");
            break;
        case 3:
            novo_salario = salario + (salario * 0.20);
            JOptionPane.showMessageDialog(null,"Seu novo cargo é Caixa e seu salário será R$ " +novo_salario+ ".");
            break;
        case 4: 
        novo_salario = salario + (salario * 0.10);
            JOptionPane.showMessageDialog(null,"Seu novo cargo é Gerente e seu salário será R$ " +novo_salario+ ".");
            break;
        default: JOptionPane.showMessageDialog(null,"Não há Cargo, tente novamente");
    }
  }
}
