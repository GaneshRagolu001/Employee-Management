package com.luv2code.springboot.employeemanagement.Controller;

import com.luv2code.springboot.employeemanagement.entity.Employee;
import com.luv2code.springboot.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    public EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String getAllEmployees(Model model){
        List<Employee> allEmployees = employeeService.findAll();

        model.addAttribute("employees",allEmployees);

        return "Employees/list-employees";
    }

    @GetMapping("/register")
    public String AddEmployee(Model model){
        Employee theemployee = new Employee();

        model.addAttribute("employee",theemployee);
        return "Employees/register";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theemp){
        employeeService.save(theemp);

        return "redirect:/employees/list";
    }

    @GetMapping("/editEmployee")
    public String UpdateEmployee(@RequestParam("employeeId") int theId,Model model){
        Employee theemployee = employeeService.findById(theId);
        model.addAttribute("employee",theemployee);

        return "Employees/register";
    }

    @GetMapping("/deleteEmployee")
    public String DeleteEmployee(@RequestParam("employeeId") int theId){
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }

}
