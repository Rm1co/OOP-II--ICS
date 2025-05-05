class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void checkResult() {
        if (score >= 50) {
            System.out.println(name + " passed.");
        } else {
            System.out.println(name + " failed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 65);
        Student s2 = new Student("Bob", 45);

        s1.checkResult();
        s2.checkResult();
    }
}
ch