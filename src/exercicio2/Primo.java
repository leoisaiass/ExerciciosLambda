package segundoexercicio;

public class Primo {
    public static void main(String[] args) {
        IPrimo primo = (a) -> a % 2 != 0;
        System.out.println(primo.ehPrimo(8));
    }
}
