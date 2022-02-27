package _16_io_text_file.ss16_io_text_file.Thuc_hanh;

public class Student {
    private int age;
    private String name;
    private double mark;

    public Student(int age, String name, double mark) {
        this.age = age;
        this.name = name;
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "age=" + age + ", name=" + name + '\'' + ", mark=" + mark ;
    }
}
