package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex5;

public class Student implements Comparable<Student> {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        if(this.id > o.id) return 1;
        else if (this.id == o.id) return 0;
        return -1;
    }
}
