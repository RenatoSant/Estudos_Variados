package exercicios1;

public class TesteGenerics <T> {

    private T valor;

    public TesteGenerics(){

    }
     public void add(T valor){
        this.valor = valor;
     }

     public T getValor(){
        return valor;
     }

    @Override
    public String toString() {
        return
                " " + valor +
                ' ';
    }
}
