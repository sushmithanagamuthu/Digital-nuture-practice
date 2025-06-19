public class Main {
    public static void main(String[] args) {
        // Basic computer
        Computer basic = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .build();

        // Gaming computer
        Computer gaming = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .build();

        System.out.println("Basic Computer:");
        basic.displaySpecs();

        System.out.println("\nGaming Computer:");
        gaming.displaySpecs();
    }
}
