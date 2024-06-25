package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam5;

public class Student implements Comparable<Student>{
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        if(id > o.getId()) {
            return 1;
        } else if (id == o.getId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
