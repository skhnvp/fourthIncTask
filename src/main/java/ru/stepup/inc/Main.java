package ru.stepup.inc;

/*
Создайте класс Сотрудник (Employee), которая описывается именем (в строковой форме) и отделом (Department),
в котором сотрудник работает, причем у каждого отдела есть название и начальник, который также является Сотрудником.

Сотрудник может быть приведен к текстовой форме вида: “Имя работает в отделе Название, начальник которого Имя”.
В случае если сотрудник является руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.

Необходимо гарантировать, что Начальник отдела всегда работает в том отделе, где он начальник.

Задача считается решенной корректно, если выполняются требования инкапсуляции.
*/

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Иван");
        Employee e2 = new Employee("Петр");
        Employee e3 = new Employee("Николай");

        Department d1 = new Department("Москва", e1);
        Department d2 = new Department("Самара", e3);

        e2.setDep(d1);

        try {
            e1.setDep(d2);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


    }
}