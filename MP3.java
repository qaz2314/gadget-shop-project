public class MP3 extends Gadget {
    private int availableMemory;

    public MP3(String model, double price, int weight, String size, int availableMemory) {
        super(model, price, weight, size);
        this.availableMemory = availableMemory;
    }

    // Accessor method
    public int getAvailableMemory() { return availableMemory; }

    // Method to download music
    public void downloadMusic(int memorySize) {
        if (memorySize <= availableMemory) {
            availableMemory -= memorySize;
            System.out.println("Downloaded music using " + memorySize + " MB of memory.");
        } else {
            System.out.println("Insufficient memory to download the music.");
        }
    }

    // Method to delete music
    public void deleteMusic(int memorySize) {
        if (memorySize <= availableMemory) {
            availableMemory += memorySize;
            System.out.println("Deleted music, freeing up " + memorySize + " MB of memory.");
        } else {
            System.out.println("Specified memory size is more than the total available memory.");
        }
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Available Memory: " + availableMemory + " MB");
    }
}
