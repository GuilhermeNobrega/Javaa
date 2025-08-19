package Exerciciosbasicos;

public class Convertor_binario {
    static void binario(int x){
        String binarie = Integer.toBinaryString(x);
        System.out.printf("Valor %d agora vale %s em binário\n", x, binarie);
    }
    static void hex(int x){
        String binarie = Integer.toHexString(x);
        System.out.printf("Valor %d agora vale %s em hexadecimal\n", x, binarie);
    }
    static void octal(int x){
        String binarie = Integer.toOctalString(x);
        System.out.printf("Valor %d agora vale %s em octal\n", x, binarie);
    }

    public static void main(String[] args){
        Convertor_binario.binario(7);
        Convertor_binario.hex(141);
        Convertor_binario.octal(346);

    }
}

//////////////////////////////////////////////////////////////////////////////////////////
package Exerciciosbasicos;

public class Convertor_binario {

    static String binario(int x) {
        String bin = Integer.toBinaryString(x);
        System.out.printf("Valor %d agora vale %s em binário\n", x, bin);
        return bin; // retorna a string binária
    }

    static String hex(int x) {
        String hex = Integer.toHexString(x);
        System.out.printf("Valor %d agora vale %s em hexadecimal\n", x, hex);
        return hex; // retorna a string hexadecimal
    }

    static String octal(int x) {
        String oct = Integer.toOctalString(x);
        System.out.printf("Valor %d agora vale %s em octal\n", x, oct);
        return oct; // retorna a string octal
    }

    public static void main(String[] args) {
        // chamando os métodos e guardando os retornos em variáveis
        String b = Convertor_binario.binario(7);
        String h = Convertor_binario.hex(141);
        String o = Convertor_binario.octal(346);
    }
}
