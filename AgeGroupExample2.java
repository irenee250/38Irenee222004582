public class AgeGroupExample2 {
    public static void main(String[] args) {
        int age = 40;

        if (age < 0) {
            System.out.println("Invalid age!");
        } else if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 30) {
            System.out.println("Young Adult");
        } else if (age <= 50) {
            System.out.println("Adult");
        } else if (age <= 65) {
            System.out.println("Senior Adult");
        } else {
            System.out.println("Elderly");
        }
    }
}
