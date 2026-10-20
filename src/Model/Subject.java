package Model;

import Classperson.Teacher;

public class Subject {

    private String name;
    private String code;
    private Teacher teacher;
    private double maxMarks;

    public Subject(String name, String code, Teacher teacher, double maxMarks) {
        this.name = name;
        this.code = code;
        this.teacher = teacher;
        this.maxMarks = maxMarks;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public double getMaxMarks() {
        return maxMarks;
    }
}
