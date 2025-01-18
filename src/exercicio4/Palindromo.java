package exercicio4;

public class Palindromo {
    public static void main(String[] args) {
        IPalindromo palindromo = (a) -> a.equals(new StringBuilder(a).reverse().toString());
        System.out.println(palindromo.ehPalindromo("radar"));
        System.out.println(palindromo.ehPalindromo("amor"));
    }
}