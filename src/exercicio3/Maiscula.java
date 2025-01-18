package terceiroexercicio;

public class Maiscula {
    public static void main(String[] args) {
//        IMaiuscula maiuscula = (a) -> a.toUpperCase();
        IMaiuscula maiuscula = String::toUpperCase;

        System.out.println(maiuscula.maiscula("leonardo isaias"));

    }
}
