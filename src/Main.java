import exercicios1.TesteGenerics;
import exercicios1.TryAndCatch;

public class Main {
    public static void main(String[] args) {
        TesteGenerics<Integer> numero = new TesteGenerics<>();
        TesteGenerics<String> nome = new TesteGenerics<>();
        numero.add(3); nome.add("Benjamin");
        System.out.println("Parabens " + nome.toString() + " pelo seu aniversário de " + numero.toString() + " anos.");














    }




}