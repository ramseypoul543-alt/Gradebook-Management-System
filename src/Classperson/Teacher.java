package Classperson;


public class Teacher extends Person {

    private String teacherId;

    public Teacher(String name, String teacherId) {
        super(name);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }
}
