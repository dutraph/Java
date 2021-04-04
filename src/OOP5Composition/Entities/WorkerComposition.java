package OOP5Composition.Entities;

import OOP5Composition.Entities.Enums.WorkerLevelComposition;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WorkerComposition {
    private String name;
    private WorkerLevelComposition level;
    private Double baseSalary;

    // Associações
    private DepartmentComposition department; //Tem 1
    private List<HourContractComposition> contracts = new ArrayList<>(); //Tem muitos (por isso a lista) NAO INCLUIR NO CONSTRUTOR

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public WorkerComposition() {
    }

    public WorkerComposition(String name, WorkerLevelComposition level, Double baseSalary, DepartmentComposition department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevelComposition getLevel() {
        return level;
    }

    public void setLevel(WorkerLevelComposition level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public DepartmentComposition getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentComposition department) {
        this.department = department;
    }

    public List<HourContractComposition> getContracts() {
        return contracts;
    }

    public void addContract(HourContractComposition contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContractComposition contract) {
        //Idea: addicionar um ID no funcionario e remover por ID
        //contracts.removeIf(x -> x.contracts.id == 1234); //Lambda function
        contracts.remove(contract);

    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContractComposition c : contracts) {
            cal.setTime(c.getDate());
            int y = cal.get(Calendar.YEAR);
            int m = cal.get(Calendar.MONTH) + 1;
            if (year == y && month == m) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", department: " + department;
    }
}
