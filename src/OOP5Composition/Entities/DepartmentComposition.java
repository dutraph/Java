package OOP5Composition.Entities;

public class DepartmentComposition {
    private String name;

    public DepartmentComposition() {
    }

    public DepartmentComposition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
