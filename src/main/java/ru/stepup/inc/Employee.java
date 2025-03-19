package ru.stepup.inc;

public class Employee {
    private final String name;
    private Department dep;

    Employee(String name) {
        this.name = name;
        this.dep = null;
    }

    public String getName() {
        return name;
    }

    public Department getDep() {
        return new Department(dep.getName(), dep.getHeadOffice());
    }

    public void setDep(Department dep) {
        if (this.dep == null) {
            this.dep = dep;
            dep.addEmps(this);
        } else if (this.dep != null) {
            if (this.dep.getHeadOffice().equals(this)) {
                throw new IllegalArgumentException("Начальник отдела всегда работает в том отделе, где он начальник");
            }

            this.dep.removeEmps(this);
            this.dep = dep;
            dep.addEmps(this);
        }

    }

    @Override
    public String toString() {
        if (dep == null) {
            return name + " не привязан к отделу";
        } else if (this.name.equals(this.dep.getHeadOffice().getName())) {
            return name + " начальник отдела " + dep.getName();
        } else {
            return name + " работает в отделе " + dep.getName() + ", начальник которого " + dep.getHeadOffice().getName();
        }
    }
}
