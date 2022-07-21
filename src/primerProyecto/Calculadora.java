package primerProyecto;

public class Calculadora {
    int operando1;
    int operando2;

    public  void sumar(){
        int suma=operando1+operando2;
        System.out.println("la suma es "+suma);
    }

    public int restar(int operando1,int operando2){
        return operando1-operando2;
    };

    public Calculadora(int operando1, int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
    }
    public  Calculadora(int operando1){
        this.operando1=operando1;
    }



}
