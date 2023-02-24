package Day2;

public class PayRoll_ex3 {
    public static void main(String[] args) {
        Employee e= new SalesManages("Ramu" , "20-2-2020" , "Sales Manager" , 20000);
        e.PrintPayroll();
    }
}


/* 
 * Employee
 * 
 * 
 * Sales Person             Worker
 * Sales manager
 * Sales territory manager
 */
abstract class Employee{
    String DateOfJoining;
    String Role;
    int Salary;
    String name;
    Employee( String n,String d , String r , int S){
        this.name= n;
        this.DateOfJoining = d;
        this.Role =r;
        this.Salary=S;
    }
    public abstract void PrintPayroll();
}

abstract class Worker extends Employee{

    Worker(String n,String d, String r, int S) {
        super(n,d,  r, S);
    } 
    public void  PrintPayroll(){
        System.out.println("Payroll for Worker:");
        System.out.println("Name: "+this.name);
        System.out.println("Role: "+this.Role);
        System.out.println("Date of Joining: "+this.DateOfJoining);
        System.out.println("Salary: "+this.Salary);
    }
    
}

 abstract class SalesPerson extends Employee{
    
    SalesPerson(String n,String d, String r, int S) {
        super(n,d,  r, S);
    } 
    public void  PrintPayroll(){
        System.out.println("Payroll for Sales Person:");
        System.out.println("Name: "+this.name);
        System.out.println("Role: "+this.Role);
        System.out.println("Date of Joining: "+this.DateOfJoining);
        System.out.println("Salary: "+this.Salary);
    }
    
 }
 class SalesManages extends SalesPerson{

    SalesManages(String n,String d, String r, int S) {
        super(n,d,  r, S);
    } 
    public void  PrintPayroll(){
        System.out.println("Payroll for Sales Manager:");
        System.out.println("Name: "+this.name);
        System.out.println("Role: "+this.Role);
        System.out.println("Date of Joining: "+this.DateOfJoining);
        System.out.println("Salary: "+this.Salary);
    }

 }
 class SalesTerritoryManager extends SalesPerson{

    SalesTerritoryManager(String n,String d, String r, int S) {
        super(n,d,  r, S);
    } 
    public void  PrintPayroll(){
        System.out.println("Payroll for Sales Territory Manager:");
        System.out.println("Name: "+this.name);
        System.out.println("Role: "+this.Role);
        System.out.println("Date of Joining: "+this.DateOfJoining);
        System.out.println("Salary: "+this.Salary);
    }
 }
