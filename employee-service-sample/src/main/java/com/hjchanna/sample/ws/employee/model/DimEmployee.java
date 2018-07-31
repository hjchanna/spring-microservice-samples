package com.hjchanna.sample.ws.employee.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dim_employee")
public class DimEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeKey;
    private String fullName;
    private Date birthDate;
    private Date hireDate;
    private String department;
    private String title;
    private String emailAddress;
    private String loginId;
    private String phone;
    private String status;

    public DimEmployee() {
    }

    public Integer getEmployeeKey() {
        return employeeKey;
    }

    public void setEmployeeKey(Integer employeeKey) {
        this.employeeKey = employeeKey;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
