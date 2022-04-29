package Exemplos;

public class Exemplo2 {
    
    public static void main(String[] args) {
        System.out.println(fibonacci(40));
    }

   public static int fibonacci(int base) {
        if (base <= 2) {
            return 1;
        } else {
            return fibonacci(base - 1) + fibonacci(base - 2);
        }
    }
}
