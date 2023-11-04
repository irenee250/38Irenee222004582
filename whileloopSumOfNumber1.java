public class whileloopSumOfNumber1 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("The sum of numbers kuva kuri 1 to 10 is: " + sum);
    }
}
