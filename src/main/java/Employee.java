import java.math.BigDecimal;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.bonus = BigDecimal.valueOf(0);
        this.baseSalary = BigDecimal.valueOf(0);
    }

    public Employee(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
        this.bonus = BigDecimal.valueOf(0);
        this.baseSalary = BigDecimal.valueOf(0);
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this(name, surname, age);
        this.baseSalary = baseSalary;
        this.bonus = BigDecimal.valueOf(0);

    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this(name, surname, age, baseSalary);
        this.bonus = bonus;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + " " + surname + " is " + age;
    }

    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

}
