/**
 * Java 1. HomeWork 5
 *
 * @author Dmitriy Ivanovskiy
 * @version 23.09.21
 */

public class Employee {
    private String fIO;
    private String officialPosition;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String fIO, String officialPosition, String email, String phone, int salary, int age) {
        this.fIO = fIO;
        this.officialPosition = officialPosition;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

 //Геттеры
    public String getFIO() {
        return fIO;
    }
    public String getOfficialPosition() {
        return officialPosition;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

// Сеттеры
    public void setFIO(String fIO) {
        this.fIO = fIO;
    }
    public void setOfficialPosition(String officialPosition) {
        this.officialPosition = officialPosition;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setSalary(int salary) {
        this.salary =  salary;
    }
    public void setAge(int age) {
        this.age =  age;
    }

    public String toString () {
        return "ФИО: " + fIO + ", Должность: " + officialPosition + ", email: " + email + ", Телефон: " + phone
                + ", Зарплата: " + salary + ", Возраст: " + age;
    }
}
