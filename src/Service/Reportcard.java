package Service;

import Classperson.Student;
import Model.Subject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Reportcard {

    private Gradebook gradebook;
    private String term;
    private int year;

    public Reportcard(Gradebook gradebook, String term, int year) {
        this.gradebook = gradebook;
        this.term = term;
        this.year = year;
    }

    public void generateReport(Student student) {

        System.out.println("===== STUDENT REPORT CARD =====");
        System.out.println("Name: " + student.getName());
        System.out.println("Admission No: " + student.getAdmissionNumber());
        System.out.println("Class: " + student.getClassName());
        System.out.println("Stream: " + student.getStream());
        System.out.println("Term: " + term);
        System.out.println("Year: " + year);

        System.out.println("\n----- SUBJECT RESULTS -----");

        for (Subject subject : gradebook.getSubjects()) {

            double total =
                    gradebook.calculateSubjectTotal(
                            student, subject, term, year);

            int position =
                    gradebook.getSubjectPosition(
                            student, subject, term, year);

            System.out.println(
                    subject.getName()
                            + ": " + total
                            + " | Position: " + position
            );
        }

        double average =
                gradebook.calculateAverage(student, term, year);

        String grade =
                gradebook.calculateGrade(student, term, year);

        int rank =
                gradebook.getStudentRank(student, term, year);

        System.out.println("\n----- OVERALL RESULTS -----");
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Overall Position: " + rank);
    }

    public void saveReportToFile(Student student) {

        String fileName =
                student.getAdmissionNumber()
                        + "_" + term.replace(" ", "_")
                        + "_" + year
                        + "_ReportCard.txt";
        try {

            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println("===== STUDENT REPORT CARD =====");
            writer.println("Name: " + student.getName());
            writer.println("Admission No: " + student.getAdmissionNumber());
            writer.println("Class: " + student.getClassName());
            writer.println("Stream: " + student.getStream());
            writer.println("Term: " + term);
            writer.println("Year: " + year);

            writer.println();
            writer.println("----- SUBJECT RESULTS -----");

            for (Subject subject : gradebook.getSubjects()) {

                double total =
                        gradebook.calculateSubjectTotal(
                                student, subject, term, year);

                int position =
                        gradebook.getSubjectPosition(
                                student, subject, term, year);

                writer.println(
                        subject.getName()
                                + ": " + total
                                + " | Position: " + position
                );
            }

            double average =
                    gradebook.calculateAverage(student, term, year);

            String grade =
                    gradebook.calculateGrade(student, term, year);

            int rank =
                    gradebook.getStudentRank(student, term, year);

            writer.println();
            writer.println("----- OVERALL RESULTS -----");
            writer.println("Average: " + average);
            writer.println("Grade: " + grade);
            writer.println("Overall Position: " + rank);

            writer.close();

            System.out.println("Report card saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "Error saving report: " + e.getMessage()
            );
        }
    }
}