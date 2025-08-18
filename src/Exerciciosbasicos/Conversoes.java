package Exerciciosbasicos;

public class Conversoes {
    public static void main(String[] args){
        int x =14;
        String x_string = String.valueOf(x);
        System.out.println("Conversão de x = " +x+"para string" +x_string);
        String valor = "54321";
        int valor_int = Integer.parseInt(valor);
        System.out.println("x era string = " +valor+ "e agora vale um inteiro!" +valor_int);
    }
}
