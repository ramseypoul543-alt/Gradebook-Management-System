package Classperson;

public class Student extends Person implements Comparable<Student> {

    private String admissionNumber;
    private String className;
    private String stream;
    private double average;

    public Student(String name, String admissionNumber,
                   String className, String stream) {

        super(name);
        this.admissionNumber = admissionNumber;
        this.className = className;
        this.stream = stream;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public String getClassName() {
        return className;
    }

    public String getStream() {
        return stream;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(otherStudent.average, this.average);
    }
}


