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
