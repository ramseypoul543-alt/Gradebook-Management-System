package Service;

import Classperson.Student;
import Model.Subject;
import Model.Mark;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Gradebook {

    private List<Student> students;
    private List<Subject> subjects;
    private List<Mark> marks;

    public Gradebook() {
        students = new ArrayList<>();
        subjects = new ArrayList<>();
        marks = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Mark> getMarks() {
        return marks;
    }
    public double calculateAverage(
            Student student,
            String term,
            int year) {

        double total = 0;
        int subjectCount = 0;

        for (Subject subject : subjects) {

            double subjectTotal =
                    calculateSubjectTotal(
                            student, subject, term, year
                    );

            total += subjectTotal;
            subjectCount++;
        }

        if (subjectCount == 0) {
            return 0;
        }

        return total / subjectCount;
    }

    public String calculateGrade(
            Student student,
            String term,
            int year) {

        double average =
                calculateAverage(student, term, year);

        if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    public void rankStudents(String term, int year) {

        for (Student student : students) {

            double average =
                    calculateAverage(student, term, year);

            student.setAverage(average);
        }

        Collections.sort(students);
    }
    public int getStudentRank(
            Student student,
            String term,
            int year) {

        rankStudents(term, year);

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i) == student) {
                return i + 1;
            }
        }

        return -1;
    }
    public int getSubjectPosition(
            Student student,
            Subject subject,
            String term,
            int year) {

        double studentTotal =
                calculateSubjectTotal(student, subject, term, year);

        int position = 1;

        for (Student otherStudent : students) {

            if (otherStudent != student) {

                double otherTotal =
                        calculateSubjectTotal(
                                otherStudent, subject, term, year);

                if (otherTotal > studentTotal) {
                    position++;
                }
            }
        }

        return position;
    }

    public double calculateSubjectTotal(
            Student student,
            Subject subject,
            String term,
            int year) {

        double total = 0;

        for (Mark mark : marks) {

            if (mark.getStudent() == student &&
                    mark.getSubject() == subject &&
                    mark.getTerm().equals(term) &&
                    mark.getYear() == year) {

                total += mark.getScore();
            }
        }

        return total;
    }

}