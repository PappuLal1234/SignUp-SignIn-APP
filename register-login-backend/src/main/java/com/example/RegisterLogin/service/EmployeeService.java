package com.example.RegisterLogin.service;


import com.example.RegisterLogin.dto.EmployeeDTO;
import com.example.RegisterLogin.dto.LoginDTO;
import com.example.RegisterLogin.payload.LoginMessage;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginMessage loginEmployee(LoginDTO loginDTO);
}
