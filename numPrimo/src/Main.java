public class Main {
    public static boolean isPrimo (int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 65, 4, 53, 44, 56, 5};
        int [] numerosNprimos =new int[numeros.length];
        int []numerosPrimos =new int[numeros.length];
        int indiceNprimo =0;
        int indicePrimo = 0;
        int y = 0;
        int maior = 0 ;
        int atual = 0;




        for (int i = 0; i < numeros.length; i++) {
            if (isPrimo(numeros[i])) {
                numerosPrimos[indicePrimo] = numeros[i];
                indicePrimo++;
            } else {
                numerosNprimos[indiceNprimo] = numeros[i];
                indiceNprimo++;
            }
        }

        for (int x = 0; x <=indiceNprimo ; x++) {
            System.out.println("Os números não primos são: " + numerosNprimos[x]);

        }
        System.out.println("-------------------------------------------------------------");

        for (int j = 0; j <=indicePrimo ; j++) {
            System.out.println("Os números primos são: " + numerosPrimos[j]);
        }
        System.out.println("-------------------------------------------------------------");


        while (y <= numerosPrimos.length -1){
            atual = numerosPrimos[y];
            if (atual > maior){
                maior = atual;

            }
            y++;


        }
        System.out.println("O maior número é: " + maior);


    }
}