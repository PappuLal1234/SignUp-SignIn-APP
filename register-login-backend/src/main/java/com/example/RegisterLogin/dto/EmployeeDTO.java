package com.example.RegisterLogin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private int employeeId;
    private String employeeName;
    private String email;
    private String password;



}
