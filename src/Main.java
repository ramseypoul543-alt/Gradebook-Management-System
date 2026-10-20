import Classperson.Student;
import Classperson.Teacher;
import Model.Subject;
import Model.Mark;
import Service.Gradebook;
import Service.Reportcard;
import Assessment.Cat;
import Assessment.Assignment;
import Assessment.Exam;

public class Main {

    public static void main(String[] args) {

        // Create the gradebook
        Gradebook gradebook = new Gradebook();

        // Create a teacher
        Teacher teacher =
                new Teacher("Mr. Kamau", "T001");



        // CREATE SUBJECTS


        Subject mathematics =
                new Subject(
                        "Mathematics",
                        "MAT101",
                        teacher,
                        100
                );

        Subject english =
                new Subject(
                        "English",
                        "ENG101",
                        teacher,
                        100
                );

        Subject science =
                new Subject(
                        "Science",
                        "SCI101",
                        teacher,
                        100
                );


        // Add subjects to the gradebook
        gradebook.addSubject(mathematics);
        gradebook.addSubject(english);
        gradebook.addSubject(science);



        // CREATE STUDENTS


        Student john =
                new Student(
                        "John",
                        "ADM001",
                        "Form 2",
                        "East"
                );

        Student mary =
                new Student(
                        "Mary",
                        "ADM002",
                        "Form 2",
                        "East"
                );

        Student peter =
                new Student(
                        "Peter",
                        "ADM003",
                        "Form 2",
                        "East"
                );


        // Add students to the gradebook
        gradebook.addStudent(john);
        gradebook.addStudent(mary);
        gradebook.addStudent(peter);


        // JOHN - MATHEMATICS


        Cat johnMathCAT =
                new Cat("Math CAT", 18, 20);

        Assignment johnMathAssignment =
                new Assignment(
                        "Math Assignment",
                        9,
                        10
                );

        Exam johnMathExam =
                new Exam(
                        "Math Exam",
                        65,
                        70
                );


        // Create John's Mathematics marks
        Mark johnMathCATMark =
                new Mark(
                        john,
                        mathematics,
                        johnMathCAT,
                        "Term 1",
                        2026
                );

        Mark johnMathAssignmentMark =
                new Mark(
                        john,
                        mathematics,
                        johnMathAssignment,
                        "Term 1",
                        2026
                );

        Mark johnMathExamMark =
                new Mark(
                        john,
                        mathematics,
                        johnMathExam,
                        "Term 1",
                        2026
                );


        // Add John's Mathematics marks
        gradebook.addMark(johnMathCATMark);
        gradebook.addMark(johnMathAssignmentMark);
        gradebook.addMark(johnMathExamMark);


        // MARY - MATHEMATICS


        Cat maryMathCAT =
                new Cat("Math CAT", 19, 20);

        Assignment maryMathAssignment =
                new Assignment(
                        "Math Assignment",
                        10,
                        10
                );

        Exam maryMathExam =
                new Exam(
                        "Math Exam",
                        68,
                        70
                );


        Mark maryMathCATMark =
                new Mark(
                        mary,
                        mathematics,
                        maryMathCAT,
                        "Term 1",
                        2026
                );

        Mark maryMathAssignmentMark =
                new Mark(
                        mary,
                        mathematics,
                        maryMathAssignment,
                        "Term 1",
                        2026
                );

        Mark maryMathExamMark =
                new Mark(
                        mary,
                        mathematics,
                        maryMathExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(maryMathCATMark);
        gradebook.addMark(maryMathAssignmentMark);
        gradebook.addMark(maryMathExamMark);



        // PETER - MATHEMATICS


        Cat peterMathCAT =
                new Cat("Math CAT", 15, 20);

        Assignment peterMathAssignment =
                new Assignment(
                        "Math Assignment",
                        8,
                        10
                );

        Exam peterMathExam =
                new Exam(
                        "Math Exam",
                        57,
                        70
                );


        Mark peterMathCATMark =
                new Mark(
                        peter,
                        mathematics,
                        peterMathCAT,
                        "Term 1",
                        2026
                );

        Mark peterMathAssignmentMark =
                new Mark(
                        peter,
                        mathematics,
                        peterMathAssignment,
                        "Term 1",
                        2026
                );

        Mark peterMathExamMark =
                new Mark(
                        peter,
                        mathematics,
                        peterMathExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(peterMathCATMark);
        gradebook.addMark(peterMathAssignmentMark);
        gradebook.addMark(peterMathExamMark);



        // JOHN - ENGLISH


        Cat johnEnglishCAT =
                new Cat(
                        "English CAT",
                        16,
                        20
                );

        Assignment johnEnglishAssignment =
                new Assignment(
                        "English Assignment",
                        8,
                        10
                );

        Exam johnEnglishExam =
                new Exam(
                        "English Exam",
                        60,
                        70
                );


        Mark johnEnglishCATMark =
                new Mark(
                        john,
                        english,
                        johnEnglishCAT,
                        "Term 1",
                        2026
                );

        Mark johnEnglishAssignmentMark =
                new Mark(
                        john,
                        english,
                        johnEnglishAssignment,
                        "Term 1",
                        2026
                );

        Mark johnEnglishExamMark =
                new Mark(
                        john,
                        english,
                        johnEnglishExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(johnEnglishCATMark);
        gradebook.addMark(johnEnglishAssignmentMark);
        gradebook.addMark(johnEnglishExamMark);



        // MARY - ENGLISH


        Cat maryEnglishCAT =
                new Cat(
                        "English CAT",
                        17,
                        20
                );

        Assignment maryEnglishAssignment =
                new Assignment(
                        "English Assignment",
                        9,
                        10
                );

        Exam maryEnglishExam =
                new Exam(
                        "English Exam",
                        62,
                        70
                );


        Mark maryEnglishCATMark =
                new Mark(
                        mary,
                        english,
                        maryEnglishCAT,
                        "Term 1",
                        2026
                );

        Mark maryEnglishAssignmentMark =
                new Mark(
                        mary,
                        english,
                        maryEnglishAssignment,
                        "Term 1",
                        2026
                );

        Mark maryEnglishExamMark =
                new Mark(
                        mary,
                        english,
                        maryEnglishExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(maryEnglishCATMark);
        gradebook.addMark(maryEnglishAssignmentMark);
        gradebook.addMark(maryEnglishExamMark);



        // PETER - ENGLISH


        Cat peterEnglishCAT =
                new Cat(
                        "English CAT",
                        14,
                        20
                );

        Assignment peterEnglishAssignment =
                new Assignment(
                        "English Assignment",
                        7,
                        10
                );

        Exam peterEnglishExam =
                new Exam(
                        "English Exam",
                        55,
                        70
                );


        Mark peterEnglishCATMark =
                new Mark(
                        peter,
                        english,
                        peterEnglishCAT,
                        "Term 1",
                        2026
                );

        Mark peterEnglishAssignmentMark =
                new Mark(
                        peter,
                        english,
                        peterEnglishAssignment,
                        "Term 1",
                        2026
                );

        Mark peterEnglishExamMark =
                new Mark(
                        peter,
                        english,
                        peterEnglishExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(peterEnglishCATMark);
        gradebook.addMark(peterEnglishAssignmentMark);
        gradebook.addMark(peterEnglishExamMark);



        // JOHN - SCIENCE


        Cat johnScienceCAT =
                new Cat(
                        "Science CAT",
                        17,
                        20
                );

        Assignment johnScienceAssignment =
                new Assignment(
                        "Science Assignment",
                        9,
                        10
                );

        Exam johnScienceExam =
                new Exam(
                        "Science Exam",
                        61,
                        70
                );


        Mark johnScienceCATMark =
                new Mark(
                        john,
                        science,
                        johnScienceCAT,
                        "Term 1",
                        2026
                );

        Mark johnScienceAssignmentMark =
                new Mark(
                        john,
                        science,
                        johnScienceAssignment,
                        "Term 1",
                        2026
                );

        Mark johnScienceExamMark =
                new Mark(
                        john,
                        science,
                        johnScienceExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(johnScienceCATMark);
        gradebook.addMark(johnScienceAssignmentMark);
        gradebook.addMark(johnScienceExamMark);



        // MARY - SCIENCE


        Cat maryScienceCAT =
                new Cat(
                        "Science CAT",
                        18,
                        20
                );

        Assignment maryScienceAssignment =
                new Assignment(
                        "Science Assignment",
                        8,
                        10
                );

        Exam maryScienceExam =
                new Exam(
                        "Science Exam",
                        64,
                        70
                );


        Mark maryScienceCATMark =
                new Mark(
                        mary,
                        science,
                        maryScienceCAT,
                        "Term 1",
                        2026
                );

        Mark maryScienceAssignmentMark =
                new Mark(
                        mary,
                        science,
                        maryScienceAssignment,
                        "Term 1",
                        2026
                );

        Mark maryScienceExamMark =
                new Mark(
                        mary,
                        science,
                        maryScienceExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(maryScienceCATMark);
        gradebook.addMark(maryScienceAssignmentMark);
        gradebook.addMark(maryScienceExamMark);



        // PETER - SCIENCE


        Cat peterScienceCAT =
                new Cat(
                        "Science CAT",
                        15,
                        20
                );

        Assignment peterScienceAssignment =
                new Assignment(
                        "Science Assignment",
                        7,
                        10
                );

        Exam peterScienceExam =
                new Exam(
                        "Science Exam",
                        56,
                        70
                );


        Mark peterScienceCATMark =
                new Mark(
                        peter,
                        science,
                        peterScienceCAT,
                        "Term 1",
                        2026
                );

        Mark peterScienceAssignmentMark =
                new Mark(
                        peter,
                        science,
                        peterScienceAssignment,
                        "Term 1",
                        2026
                );

        Mark peterScienceExamMark =
                new Mark(
                        peter,
                        science,
                        peterScienceExam,
                        "Term 1",
                        2026
                );


        gradebook.addMark(peterScienceCATMark);
        gradebook.addMark(peterScienceAssignmentMark);
        gradebook.addMark(peterScienceExamMark);



        // MATHEMATICS POSITIONS


        System.out.println(
                "----- MATHEMATICS POSITIONS -----"
        );

        System.out.println(
                "Mary: Position " +
                        gradebook.getSubjectPosition(
                                mary,
                                mathematics,
                                "Term 1",
                                2026
                        )
        );

        System.out.println(
                "John: Position " +
                        gradebook.getSubjectPosition(
                                john,
                                mathematics,
                                "Term 1",
                                2026
                        )
        );

        System.out.println(
                "Peter: Position " +
                        gradebook.getSubjectPosition(
                                peter,
                                mathematics,
                                "Term 1",
                                2026
                        )
        );



        // CREATE REPORT CARDS


        Reportcard reportcard =
                new Reportcard(
                        gradebook,
                        "Term 1",
                        2026
                );


        // Display John's report card
        reportcard.generateReport(john);


        // Save report cards to text files
        reportcard.saveReportToFile(john);
        reportcard.saveReportToFile(mary);
        reportcard.saveReportToFile(peter);


        System.out.println(
                "Students and subjects added successfully!"
        );
    }
}