public class SimpleInterest2 {
    double principal;
    double rate;
    int time;

    public void interest() {
        double si = (principal * rate * time) / 100.0;
        System.out.println("The simple interest of Mr. Bob = " + si + " RWK");
    }

    public static void main(String[] args) {
        SimpleInterest2 call = new SimpleInterest2();

        call.principal = 100000;
        call.rate = 5;
        call.time = 5;

        call.interest();
    }
}
