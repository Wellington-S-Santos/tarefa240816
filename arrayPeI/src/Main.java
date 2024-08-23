public class Main {
    public static void main(String[] args) {
        int [] pArray = {0,1,2,3,4,5,6,7,8,9,10};
        int i = 0;

        int[] parArray= new int[pArray.length];
        int [] impAraay = new int[pArray.length];
        int indicePares =0;
        int indiceImpares = 0;

        while (i <= pArray.length -1) {
            if (pArray[i] % 2 == 0) {
                indicePares++;
                parArray[indicePares] = pArray[i];


                }else{
                indiceImpares++;
                impAraay[indiceImpares]=pArray[i];

            }
            i++;
        }
        for (int x =0; x<=indicePares; x++){
            System.out.println("Números pares: "+ parArray[x]);
        }
        for (int y = 0; y<=indiceImpares; y++) {
            System.out.println("Números impares: " + impAraay[y]);
        }

    }
}
