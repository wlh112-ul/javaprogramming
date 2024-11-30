package week9.Stock;

public class Test {
    public static void main(String[] args) {
        // Create a Stock object
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // Set previous closing price and current price
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        // Display the price change percentage
        System.out.printf("The price-change percentage is: %.2f%%\n", stock.getChangePercent());
    }
}
