package Assessment;

import Interface.Gradable;

public abstract class Assessment implements Gradable {

    protected String name;
    protected double score;
    protected double maxMarks;

    public Assessment(String name, double score, double maxMarks) {
        this.name = name;
        this.score = score;
        this.maxMarks = maxMarks;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public double getMaxMarks() {
        return maxMarks;
    }

    @Override
    public double calculatePercentage() {
        return (score / maxMarks) * 100;
    }

    @Override
    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

