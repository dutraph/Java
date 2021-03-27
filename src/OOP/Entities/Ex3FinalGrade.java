package OOP.Entities;

public class Ex3FinalGrade {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public Ex3FinalGrade(String name, double n1, double n2, double n3) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double finalGrade(){
        return (this.n1 + this.n2 + this.n3);
    }

    public String finalResult(){
        String fail = "FAIL";
        double missingPoints = 60.0 - finalGrade();
        return (this.finalGrade() > 60.0)? "PASS" :String.format("%s%nMISSING %.2f POINTS%n",fail,missingPoints);
    }


    @Override
    public String toString() {
        return "FINAL GRADE: " + String.format("%.2f%n", finalGrade()) +
                finalResult();

    }
}
