package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> list; private String name;

    public Department(String name) {
        this.name = name;
        this.list=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        list.add(employee);
    }

    public List<Employee> getList() {
        return list;
    }

    public String getName() {
        return name;
    }
}
