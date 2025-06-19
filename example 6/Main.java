public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image is loaded only when display() is called
        System.out.println("First call:");
        image1.display(); // Loads and displays

        System.out.println("\nSecond call:");
        image1.display(); // Just displays, no loading

        System.out.println("\nThird image:");
        image2.display(); // Loads and displays new image
    }
}
