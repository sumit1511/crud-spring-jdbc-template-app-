package com.entity;


public class Employee {
    private  int empId;
    private String empName;
    private String empCity;
    private int empAge;
    private String empDept;

    public Employee(String empName, String empCity, int empAge, String empDept) {
        this.empName = empName;
        this.empCity = empCity;
        this.empAge = empAge;
        this.empDept = empDept;
    }
    public Employee()
    {

    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", empAge=" + empAge +
                ", empDept='" + empDept + '\'' +
                '}';
    }
}
