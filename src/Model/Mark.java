package Model;

import Classperson.Student;
import Assessment.Assessment;

public class Mark {

    private Student student;
    private Subject subject;
    private Assessment assessment;
    private String term;
    private int year;

    public Mark(Student student, Subject subject,
                Assessment assessment,
                String term, int year) {

        this.student = student;
        this.subject = subject;
        this.assessment = assessment;
        this.term = term;
        this.year = year;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getScore() {
        return assessment.getScore();
    }
    public String getTerm() {
        return term;
    }

    public int getYear() {
        return year;
    }
    public Assessment getAssessment() { return assessment;

    }
}
