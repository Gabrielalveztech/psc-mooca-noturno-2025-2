import javax.swing.JOptionPane;

public class CalculadoraCientifica extends Calculadora {
    public CalculadoraCientifica(){
    JOptionPane.showMessageDialog
            ( null, " Calculadora Cientifica " );

    

    }

    public void mensagem() {
          JOptionPane.showMessageDialog
          ( null, "O modelo dessas calculadora é " + modelo );
      
      super.soma(3, 2)  ;
    }
    public void subtracao(){

    }
    @Override
    public double subtracao(double a, double b
    ){
        double resultado = a - b ;
        return resultado;
    }

}