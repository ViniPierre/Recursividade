package Exemplos;

public class Exemplo1recursivo {
    
public static void main(String[] args) {

    System.out.println(calcular(2,10));

   }
   private static int calcular(int base,int expoente) {
       if (expoente == 0)  return 1;
        return base * calcular(base, expoente - 1);
   }
}
