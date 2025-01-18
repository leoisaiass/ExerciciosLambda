package exercicio1;

public class Multiplicacao {
    public static void main(String[] args) {
        IMultiplicacao calculo = (a, b) -> a * b;
        System.out.println(calculo.multiplicacao(5, 3));
    }
}


