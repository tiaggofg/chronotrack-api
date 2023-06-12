package br.com.chronotrack.api.entities;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

import java.util.List;

@MongoEntity(collection = "user")
public class User {

    private ObjectId id;
    private String name;
    private String lastName;
    private String username;
    private String password;
    private String department;
    private String jobTitle;
    private String email;
    private Address address;
    private List<Clock> clocks;
    private List<Role> roles;
    private int age;
    private double weeklyWorkingHours;
    private double overtimeHours;
    private double hourBalance;
    private double missingHours;

    public User() {
    }

    public User(ObjectId id, String name, String lastName, String username, String password, String department, String jobTitle, String email, Address address, List<Clock> clocks, List<Role> roles, int age, double weeklyWorkingHours, double overtimeHours, double hourBalance, double missingHours) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.department = department;
        this.jobTitle = jobTitle;
        this.email = email;
        this.address = address;
        this.clocks = clocks;
        this.roles = roles;
        this.age = age;
        this.weeklyWorkingHours = weeklyWorkingHours;
        this.overtimeHours = overtimeHours;
        this.hourBalance = hourBalance;
        this.missingHours = missingHours;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Clock> getClocks() {
        return clocks;
    }

    public void setClocks(List<Clock> clocks) {
        this.clocks = clocks;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    public void setWeeklyWorkingHours(double weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getHourBalance() {
        return hourBalance;
    }

    public void setHourBalance(double hourBalance) {
        this.hourBalance = hourBalance;
    }

    public double getMissingHours() {
        return missingHours;
    }

    public void setMissingHours(double missingHours) {
        this.missingHours = missingHours;
    }
}
