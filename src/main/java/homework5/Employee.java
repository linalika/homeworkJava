package homework5;

public class Employee {
    //ФИО, должность, email, телефон, зарплата, возраст.
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    public void info() {
        System.out.println(this);
    }

}
