package exercicios1;


public class TryAndCatch {
    int [] vetor = new int[4];

    public void testeVetorExceptions() {
        try {
            System.out.println("Antes da exception");
            vetor[4] = 1;
            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Indice inexistente.");
        }
        System.out.println("errrrrrrooooooouuu!");

    }
}