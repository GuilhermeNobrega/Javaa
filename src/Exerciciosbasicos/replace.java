package Exerciciosbasicos;

public class replace {
    //Trocar vírgula por ponto!!!
    public static void main(String[] args){
        String x = "14,5";
        String y = "18,8";
        System.out.println(x);
        System.out.println(y);
        if(x.contains(",") && y.contains(",")){
            System.out.println("Realizando troca de ',' por '.' :\n");
            String clean_x = x.replace(",",".");
            String clean_y = y.replace(",",".");
            //System.out.println(clean_x.getClass());
            System.out.println(clean_x);
            System.out.println(clean_y);
            System.out.println("Feita essa correção, agora é hora para somar os nossos valores. Vamos converter de String para double:\n");
            double doubleX = Double.parseDouble(clean_x);
            double doubleY = Double.parseDouble(clean_y);
            double soma = doubleX + doubleY;
            System.out.printf("A soma entre %.2f e %.2f vale %.2f", doubleX, doubleY, soma);
        }
    }
}
