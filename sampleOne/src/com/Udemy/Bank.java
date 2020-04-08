package com.Udemy;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Bank {
    private String name;
    private  ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        //this.branches=new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    private Branch findBranch(String branchName){
        return branches
                .parallelStream()
                .filter(branch -> branch.getName().equalsIgnoreCase(branchName))
                .findFirst()
                .orElseThrow();
    }

    public String addBranch(String branchName){
        try {
            findBranch(branchName);
            return "Branch already exist.";
        }catch (NoSuchElementException e){
            System.out.println("Branch Not found.");
        }catch (Exception e){
            throw e;
        }
        this.branches.add(new Branch(branchName));
        return "Branch added.";
    }

    public boolean addCustomer(String branchName,String CustomerName,double amount){
        Branch branch=findBranch(branchName);
        if(branch!=null){
            return branch.addCustomer(CustomerName,amount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String CustomerName,double amount){
       Branch branch=findBranch(branchName);
       if (branch!=null){
           return branch.addCustomer(CustomerName,amount);
       }
       return false;
    }
}



