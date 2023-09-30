import java.util.Objects;

public class Employee {

    public static int idGenerator = 1;

    private int id;
    private String fullNameOfEmployee;
    private int department;
    private double salary;

    public Employee(String fullNameOfEmployee, int department, int salary) {
        this.id = idGenerator++;
        this.fullNameOfEmployee = fullNameOfEmployee;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullNameOfEmployee() {
        return fullNameOfEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int setDepartment(int department) {
        this.department = department;
        return department;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    @Override
    public String toString() {
        return "Сотрудник с id: " + id + ". ФИО  " + fullNameOfEmployee + ". Отдел №" +
                department + ", зарплата составляет: " + salary + 'р';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(department);
    }
}


