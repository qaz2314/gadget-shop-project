public class Mobile extends Gadget {
    private int callingCredit;

    public Mobile(String model, double price, int weight, String size, int callingCredit) {
        super(model, price, weight, size);
        this.callingCredit = callingCredit;
    }

    // Accessor method
    public int getCallingCredit() { return callingCredit; }

    // Method to add calling credit
    public void addCallingCredit(int amount) {
        if (amount > 0) {
            callingCredit += amount;
        } else {
            System.out.println("Please enter a positive amount.");
        }
    }

    // Method to make a call
    public void makeCall(String phoneNumber, int duration) {
        if (duration <= callingCredit) {
            System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
            callingCredit -= duration;
        } else {
            System.out.println("Insufficient credit to make the call.");
        }
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Calling Credit: " + callingCredit + " minutes");
    }
}
