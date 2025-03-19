package ru.stepup.inc;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private Employee headOffice;
    private List<Employee> emps;

    Department(String name, Employee headOffice) {
        this.name = name;
        this.headOffice = headOffice;
        emps = new ArrayList<>();
        headOffice.setDep(this);
        this.addEmps(headOffice);
    }

    public void addEmps(Employee emp) {
        this.emps.add(emp);
    }

    public void removeEmps(Employee emp) {
        this.emps.remove(emp);
    }

    public String getName() {
        return name;
    }

    public Employee getHeadOffice() {
        return headOffice;
    }

    public List<Employee> getEmps() {
        return new ArrayList<>(emps);
    }
}
