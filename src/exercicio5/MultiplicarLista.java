package exercicio5;

import java.util.*;

public class MultiplicarLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 6, 9, 12, 15);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);
    }
}
