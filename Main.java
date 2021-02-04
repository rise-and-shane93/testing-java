import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Student shane = new Student("Shane", 99);
        double GPA = shane.calculateGpa(99);

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = input.next();
        
        System.out.println("Hello " + firstName);
        System.out.println("Goodbye");
        // System.out.println(GPA);
    }
}