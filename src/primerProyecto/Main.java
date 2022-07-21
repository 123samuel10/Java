package primerProyecto;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora(5,5);//crear un objeto a partir del constructor por defecto
        calculadora.sumar();
        int resultado=calculadora.restar(5,3);
        System.out.println("el resulultado de la resta es: "+resultado);

    }
}