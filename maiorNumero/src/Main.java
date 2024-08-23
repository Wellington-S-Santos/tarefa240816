public class Main {
    public static void main(String[] args) {

        int[] numeros = {44,15,12,28,53,60};
        int i = 0;
        int maior = 0 ;
        int atual =0;

        while (i <= numeros.length -1){
            atual = numeros[i];
            if (atual > maior){
                maior = atual;

            }
            i++;


        }
        System.out.println("O maior número é: " + maior);

    }
}