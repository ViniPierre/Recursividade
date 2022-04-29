package Exemplos;
public class Exemplo1 {

    public static void main(String[] args) {
     System.out.println(calcular(2,10));

    }
    private static int calcular(int base,int expoente) {
        int total = 1;
        for(int i = 1; i <= expoente; i++) {
            total = total * base;
        }
        return total;
    }
}

