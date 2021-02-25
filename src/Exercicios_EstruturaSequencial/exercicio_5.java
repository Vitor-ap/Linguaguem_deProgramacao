package Exercicios_EstruturaSequencial;

/*DECLARAR.
HR_TRAB, VALOR_HR, PERC_DESC, DEPEND, SAL, DESC, SAL_LIQ,
SAL_RECEBER: REAL;
INICIO.
LER HR_TRAB, VALOR_HR, PERC_DESC, DEPEND;
SAL = HR_TRAB * VALOR_HR;
DESC = SAL * (PERC_DESC/100);
SAL_LIQ = SAL – DESC;
SAL_RECEBER = SAL_LIQ + (DEPEND * 100);
MOSTRAR SAL_RECEBER;

Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
Calcule o salário que serão as horas trabalhadas x o valor por hora. 
Calcule o salário líquido (= Salário Bruto – desconto). 
A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber. */

import javax.swing.JOptionPane;
public class exercicio_5 {
public static void main (String argumentos[]){
double hr_trab, valor_hr, perc_desc, depend, sal, desc, sal_liq, sal_receber; 
hr_trab = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas"));
valor_hr = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da hora trabalhada"));
perc_desc = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto"));
depend = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de dependentes"));
sal = hr_trab * valor_hr;
desc = sal * (perc_desc/100);
sal_liq = sal - desc;
sal_receber = sal_liq + (depend * 100);
JOptionPane.showMessageDialog(null," O salário a receber é de R$ " + sal_receber + " reais." );
}
}