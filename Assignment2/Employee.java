package edu.ucalgary.oop;

public class Employee {
    //Object Variables
    private String name;
    private final String IDNUMBER;
    private String managerID;
    private Employee[] supervisedEmployees;

    //Constructor
    public Employee(String name, String idNumber){
        this.supervisedEmployees = new Employee[10];
        this.name = name;
        this.IDNUMBER = idNumber;
        this.managerID = null;
    }
    public Employee(String name, String idNumber, String managerID){
        this.name = name;
        this.IDNUMBER = idNumber;
        this.managerID = managerID;
    }

    //Helper Functions
    public void addEmployee(Employee newEmployee){ // --------------------------------TEST
        int n = 0;
        if (this.supervisedEmployees != null){
            n = this.supervisedEmployees.length;
        }
    
        Employee newarr[] = new Employee[n + 1];
        for(int i = 0; i < n; i++){
            newarr[i] = supervisedEmployees[i];
        }
        newarr[n] = newEmployee;
        this.supervisedEmployees = newarr;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setManagerID(String newManager){
        this.managerID = newManager;
    }

    //Getters
    public String getName(){
        return this.name;
    }
    public String getIDNumber(){
        return this.IDNUMBER;
    }
    public String getManagerID(){
        return this.managerID;
    }
    public Employee[] getEmployees(){
        return this.supervisedEmployees;
    }

}
