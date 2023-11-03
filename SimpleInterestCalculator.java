public class SimpleInterestCalculator {
    static void interest() {
        double principal = 100000;
        double rate = 5;
        int time = 5;
        double si = (principal * rate * time) / 100.0;
        System.out.println("The simple interest of Mr. Bob = " + si + " RWF");
    }

    public static void main(String[] args) {
        SimpleInterestCalculator call = new SimpleInterestCalculator(); // Create an object
        call.interest(); // Call the interest method on the object
    }
}
