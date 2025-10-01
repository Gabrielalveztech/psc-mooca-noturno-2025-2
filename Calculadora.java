import javax.swing.JOptionPane;

public class Calculadora {

    String modelo;

    // public int soma(int a, int b){
    //     int resultado =  a +b;
    //     return resultado;
        
    // }
    
    public Calculadora() {
        //construtor
        JOptionPane.showMessageDialog( null, "Calculadora Simples");

        
    }

    public double soma(double a , double b){
               double resultado = a + b;
                return resultado;

    }

      public double soma(double a , double b, double c){
               double resultado = a + b + c;
                return resultado;

    }


     public double  subtracao(double a, double b){
        double resultado;
        resultado = a - b;
        return resultado;
        
    }

    public double multiplicacao(double a, double b){
        double resultado;
        resultado = a * b;
        return resultado;
        
    }

    public double divisao(double a, double b){
        double resultado;
        resultado = a / b;
        return resultado;
        
    }



    
}