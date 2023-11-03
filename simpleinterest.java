public class simpleinterest {
  static void interest() {

    double p = 100000;
    double r = 0.05;
    int time = 5;
    double si;
    si = 100000 * 0.05 * 5 / 100;

    System.out.println("The simple interest of Mr.Bob=" + si);
  }

  public static void main(String[] args) {
    interest();
  }
}