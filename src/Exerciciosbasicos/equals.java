package Exerciciosbasicos;

public class equals {
    public static void main(String[] args){
        String name1="abc";
        String name2="abc";
        //Verificando se são semelhante iguais!!
        if(name1.equals(name2)){
            System.out.println("Identicas");
        }
        String name3="def";
        String name4="DEF";
        if(name3.equalsIgnoreCase(name4)){
            System.out.println("Apesar de serem maisculas e minusculas, são iguais");
        }
    }
}
