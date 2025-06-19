public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("MobileApp1");
        Observer web = new WebApp("WebApp1");

        market.registerObserver(mobile);
        market.registerObserver(web);

        System.out.println("Updating stock price to ₹100.0...");
        market.setStockPrice(100.0);

        System.out.println("\nUpdating stock price to ₹115.5...");
        market.setStockPrice(115.5);
    }
}
