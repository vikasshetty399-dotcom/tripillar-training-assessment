package tripillar_coding_assesment.Module_3;

public class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    String getName(){
        return name;
    }

    int getMarks() {
        return marks;
    }

    void setName(String name) {
        this.name=name;
    }

    void setmarks(int marks) {
        this.marks=marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

    }
}
class driver{
    public static void main(String[] args) {
            Student s1 = new Student("Vikas", 85);
            s1.getMarks();
            s1.getName();
            s1.display();

            s1.setName("vijay");
            s1.setmarks(99);
            s1.display();

        }
    }
