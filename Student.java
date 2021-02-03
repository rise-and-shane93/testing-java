public class Student {
    
    String name;
    double grade;
    
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double calculateGpa(double grade) {
        if (grade >= 90) {
            return 4;
        } else if (grade >= 80 && grade < 90) {
            return 3;
        } else if (grade >= 70 && grade < 80) {
            return 2;
        } else {
            return 1;
        }
    }
}