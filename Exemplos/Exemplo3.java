package Exemplos;

public class Exemplo3 {
    
    public static void main(String[] args) {
        System.out.println(contar(4713132, 3));
    }
    public static int contar(int valor, int digito) {
        int resto, aux = 0;
        if(valor == 0) return 0;
            resto = valor % 10;
        if (resto == digito) aux = 1;
        return aux + contar(valor / 10, digito);
    }
}
