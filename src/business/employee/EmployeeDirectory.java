/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.employee;

import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee addEmployee(String name) {
        Employee e = new Employee();
        e.setName(name);
        employeeList.add(e);
        return e;
    }
    
    

    public void removeEmployee(Employee e) {
        employeeList.remove(e);
    }
}
