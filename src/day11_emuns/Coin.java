package day11_emuns;

public class Coin {
    public static void main(String[] args) {
        USCurrency currency = USCurrency.QUARTER;
        System.out.println("$" + currency.getValue());
    }
}
