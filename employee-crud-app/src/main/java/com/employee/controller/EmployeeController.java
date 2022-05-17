package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/")
    public ModelAndView homeView(){
        List<Employee> emps=this.employeeService.getEmps();
        ModelAndView mav = new ModelAndView();
        mav.addObject("employees",emps);
        mav.setViewName("home");
        return mav;
    }

    @GetMapping(path="/add-employee")
    public ModelAndView addEmployee(){
        ModelAndView mav=new ModelAndView();
        Employee emp=new Employee();
        mav.setViewName("add-employee");
        mav.addObject("employee",emp);
        return mav;
    }

    @PostMapping(path="/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee emp){
        this.employeeService.saveEmployee(emp);
        return "redirect:/";
    }

    @GetMapping(path="/update-employee")
    public ModelAndView updateEmployee(@RequestParam Long employeeId){
        System.out.println(employeeId);
        ModelAndView mav=new ModelAndView();
        Employee emp=employeeService.getEmp(employeeId);
        mav.setViewName("add-employee");
        mav.addObject("employee",emp);
        return  mav;
    }
    @GetMapping(path="/delete-employee")
    public String deleteEmployee(@RequestParam Long employeeId){
        employeeService.deleteEmp(employeeId);
        return "redirect:/";
    }
}
