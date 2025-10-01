
import javax.swing.JOptionPane;

public class TestCalculadora extends Calculadora {
    public static void main(String[] args) {
CalculadoraCientifica cc = new CalculadoraCientifica();
Calculadora calc = new Calculadora();


        int op = Integer.parseInt(JOptionPane.showInputDialog("1-Soma(2 números)\n2-Soma(3 números)\n 3-Subtração\n4-Multiplicação\n5-Divisão"));

        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o primeiro operando"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o segundo operando"));
        double operando3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o terceiro operando"));
         
         double resultado;

         if(op == 1){
            resultado = calc.soma(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da soma é " + resultado);
         }

         else if(op == 2){
            resultado = calc.soma(operando1, operando2, operando3);
            JOptionPane.showMessageDialog(null, "O resultado da soma é " + resultado);
         }
         else if (op == 3){
            resultado = calc.subtracao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da subtração é " + resultado);
           
         }
          else if (op == 4){
            resultado = calc.multiplicacao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é " + resultado);
         }
          else if (op == 5){
            resultado = calc.divisao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da divisão é " + resultado);
         
         }
         else{
            JOptionPane.showMessageDialog(null, "Opção s");
         }

        
    }

    
}


