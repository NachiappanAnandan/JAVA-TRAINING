package Day3;

import java.util.Scanner;

public class Payroll_ex1 {
    public static void main(String[] args) {
         Employee E = new Worker("Raja", 007 , 80);
         E.PrintPayroll();
        
    }
}




class Employee{
    String name;
    int id;
    int hoursOfWork;
    int PayPerWork;
    String Type;
    String Role;
    

    Employee(String name , int id , int h){
        this.name = name;
        this.id = id;
        this.hoursOfWork = h;
        
    }
    public int getSalary(){
       return this.hoursOfWork*this.PayPerWork;
    }

    public void PrintPayroll(){
        System.out.println("Payroll for Worker:");
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Type: "+this.Type);
        System.out.println("Role: "+this.Role);
        System.out.println("Salary: "+this.getSalary());
    }
}



class Sales extends Employee{
    Sales(String name , int id , int h){
        super(name, id ,h);
        this.Type = "Sales";
    }
}

class Prod extends Employee{
    Prod(String name , int id , int h){
        super(name, id ,h);
        this.Type = "Production";
    }
}


class SalesPerson extends Sales{
    SalesPerson(String name , int id , int h){
        super(name, id ,h);
        this.Role = "Sales Person";
        this.PayPerWork =400;
        
    }
}
class SalesManager extends Sales{
    SalesManager(String name , int id , int h){
        super(name, id ,h);
        this.Role = "Sales Manager";
        this.PayPerWork =500;
        
    }
}
class SalesTerrirory extends Sales{
    SalesTerrirory(String name , int id , int h){
        super(name, id ,h);
        this.Role = "Sales Terrirory";
        this.PayPerWork =700;
        
    }
}
class Manager extends Sales{
    Manager(String name , int id , int h){
        super(name, id ,h);
        this.Role = "Manager";
        this.PayPerWork =1000;
        
    }
}


class Worker extends Prod{
    Worker(String name , int id , int h){
        super(name, id ,h);
        this.Role = "Worker";
        this.PayPerWork =450;
        
    }
}