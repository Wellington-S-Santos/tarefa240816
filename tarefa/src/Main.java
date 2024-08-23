public class Main {
    public static void main(String[] args) {
        int[] numeros = {44,15,12,28,53,60};
        int i = 0;
        int menor = 0 ;
        int atual =0;

        while (i <= numeros.length -1){
            atual = numeros[i];
            if (menor > atual){
                menor = atual;

            }if (menor == 0) {
                     menor = atual;
                }

                i++;
        }

        System.out.println("O menor número é: " + menor);
        System.out.println("-----------------------------------------------------------------------------------------");

        


    }

}

