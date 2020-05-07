package com.lambda;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);


        System.out.println("________________________________________________");
        Employee sonali = new Employee("sonali Sethi", 23);
        Employee asutosh = new Employee("Asutosh Behera", 25);
        Employee rosy = new Employee("Rosalin Dsouza", 29);
        List<Employee> list = new ArrayList<>();
        list.add(sonali);
        list.add(asutosh);
        list.add(rosy);
        printAgeName(list, "age > 23", employee -> employee.getAge() > 24);
        printAgeName(list, "age > 30", employee -> employee.getAge() > 30);
        printAgeName(list, "less than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate greaterThan15 = i -> i > 15;
        int a = 20;
        System.out.println(greaterThan15.test(a + 23));
        DoublePredicate doublePredicate = i -> i < 2.3;
        double z = 2.22;
        System.out.println(doublePredicate.test(z));

        //   ---------------------------------------
        System.out.println("--------------------------------------------------------");
        Random r = new Random();
        Supplier<Integer> randomSupplier = () -> r.nextInt(1000);
        for (int i = 0; i < 4; i++) {
            System.out.println(randomSupplier.get());
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!*********!!!!!!!!!!!!!!!!!!!!!!!!!");
        for (Employee employee : list) {
            Supplier<String> supplier = () -> employee.getName();
            System.out.println(supplier.get());
        }

        //CONSUMER
        System.out.println("!!!!!!!!!!!!!!!!!!!!!! CONSUMER!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept(list.get(0).getName());


        list.forEach(employee -> {
            System.out.println(employee.getName() + " Consumer " + employee.getAge());
        });


        //Function
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$ FUNCTION $$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Function<Employee, String> getLastName = (employee -> {
            return employee.getName().substring(employee.getName().indexOf(' '));
        });

     // Random r=new Random();
      for (Employee employee: list){
          System.out.println(getname(getLastName,employee));
      }


        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^CHAINED FUNCTION ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Function<Employee,String> uppercase=employee -> employee.getName().toUpperCase();
        Function<String,String> firstUpperName=name->name.substring(0,name.indexOf(' '));
        Function chainedFunction=uppercase.andThen(firstUpperName);
        System.out.println(chainedFunction.apply(list.get(1)));

        System.out.println("***************************** BI FUNCTION ***************************");
        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

    }


    private static String getname(Function<Employee, String> firstname, Employee employee) {
         return firstname.apply(employee);

    }


    public static void printAgeName(List<Employee> employeeList, String condition, Predicate<Employee> employeePredicate) {
        System.out.println(condition + "\n" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        for (Employee employee : employeeList) {
            if (employeePredicate.test(employee))
                System.out.println(employee.getName() + "   " + employee.getAge());
        }
    }

}
