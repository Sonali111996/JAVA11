package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee sonali=new Employee("Sonali",23);
        Employee sonali1=new Employee("Sonali11",24);
        Employee asu=new Employee("Asutosh",23);
        Employee papun=new Employee("Papun",24);

        Department hr=new Department("Human Resource");
        hr.addEmployee(sonali);hr.addEmployee(sonali1);

        Department finance = new Department("Finance");
        finance.addEmployee(asu);finance.addEmployee(papun);

       List<Department> departments=new ArrayList<>();
       departments.add(hr);departments.add(finance);

       departments.stream()
                  .flatMap(department -> department.getList().stream())
                  .forEach(System.out::println);
        System.out.println("********* HUMAN RESOURCE **********");
        departments.stream()
                   .filter(department -> department.getName().equals("Finance"))
                    .flatMap(department -> department.getList().stream())
                    .forEach(System.out::println);


    }
}
