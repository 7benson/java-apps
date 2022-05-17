package com.employee.service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getEmps(){
        return employeeDao.findAll();
    }

    public Employee getEmp(Long id){
        return this.employeeDao.findById(id).get();
    }

    public void saveEmployee(Employee emp){
        this.employeeDao.save(emp);
    }

    public void deleteEmp(Long employeeId) {
        this.employeeDao.deleteById(employeeId);
    }
}
