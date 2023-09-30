public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployees(String fullNameOfEmployee, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Employee book is full. Adding a new employee is restricted.");
        }
        Employee newEmployees = new Employee(fullNameOfEmployee, department, salary);
        employees[size++] = newEmployees;
    }
//    этот метод добавляет нового сотрудника

    public void removeEmployee(int IdOfEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == (IdOfEmployee)) {
                System.out.println("Сотрудник " + employees[i].getFullNameOfEmployee() + " удален(а)");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
//Этот метод сдвигает массив влево на одну ячейку, затирая ячейку под номером i путем смещения всех элементов справа на одну ячейку влево
            }
        }
    }

    public void changeSalaryAndDepartment(String fullNameEmployee, double salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullNameOfEmployee().equals(fullNameEmployee)) {
                System.out.println("Сотрудник " + employees[i].getFullNameOfEmployee() + " зарплата изменена с " +
                        employees[i].getSalary() + "р. на " + employees[i].setSalary(salary) + "р. Отдел изменен с " +
                        employees[i].getDepartment() + " на " + employees[i].setDepartment(department) + ".");
                return;
            }
        }
    }
//    этот метод меняет зарплату и отдел

    public void GetFullNameAllEmployeesByDepartment(String request, int department) {

        int count = 1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() >= count) {
                count = employees[i].getDepartment();
            }
        }

        for (int i = 0; i < employees.length; i++) {

            String allDepartmentAllEmployees = "Список всех сотрудников по всем отделам";
            String specificDepartment = "Список сотрудников по конкретному отделу";

            if (allDepartmentAllEmployees.equals(request)) {
                if (employees[i] != null) {
                    System.out.println("Сотрудник " + employees[i].getFullNameOfEmployee() + " Отдел № " + employees[i].getDepartment());
                }
            } else if (specificDepartment.equals(request)) {
                if (employees[i] != null) {
                    if (department <= count && department != 0) {
                        if (employees[i].getDepartment() != department)
                            continue;
                        {
                            System.out.println("Сотрудник " + employees[i].getFullNameOfEmployee() + " Отдел № " + employees[i].getDepartment());
                        }

                    } else {
                        System.out.println("Такого отдела нет");
                        break;
                    }
                }
            } else {
                System.out.println("Ошибка, ошибка ввод неверен");
            }
        }
    }
//    метод который выводит список всех сотрудников по всем отделам либо всех сотрудников по конкретному отделу.

    public void print() {

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null)
                System.out.println(employee);
        }
    }
//    метод реализующий вывод id, Ф.И.О, номер отдела и зарплаты сотрудника


    public double maxSalary() {

        double maximumExpensesPerDay = Integer.MIN_VALUE;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() > maximumExpensesPerDay) {
                maximumExpensesPerDay = employee.getSalary();
            }
        }
        return maximumExpensesPerDay;
    }
//    метод реализующий поиск максимальной зарплаты


    public double minSalary() {

        double minimumExpensesPerDay = Integer.MAX_VALUE;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < minimumExpensesPerDay) {
                minimumExpensesPerDay = employee.getSalary();
            }
        }
        return minimumExpensesPerDay;
    }
//    метод реализующий поиск минимальной зарплаты

    public double averageSalary() {
        double sum = 0;
        double averageSalary = 0;

        int count = 0;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum += employee.getSalary();
                count++;
                averageSalary = sum / count;
            }
        }
        return averageSalary;
    }
//    метод реализующий поиск средней зарплаты

    public double totalSalary() {
        double totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }
//    метод реализующий поиск общей зарплаты

    public static double salaryIndex(double salary, double percent) {
        salary = salary + (salary / 100) * percent;
        return salary;
    }
// метод реализующий получение конкретного процента

    public int printDepartment(int departmentNumber) {


        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber) {

                    System.out.println(employee);
                }
            }
        }
        return departmentNumber;
    }
// метод реализующий поиск зарплаты сотрудника в конкретном отделе с указанием № отдела

    public int printDepartmentWithoutNumber(int departmentNumber) {


        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber) {

                    System.out.println("Сотрудник с id: " + employee.getId() + ". ФИО  " +
                            employee.getFullNameOfEmployee() + ", зарплата составляет: " +
                            employee.getSalary() + 'р');
                }
            }
        }
        return departmentNumber;
    }
// метод реализующий поиск зарплаты сотрудника в конкретном отделе без указаниея № отдела


    public double printDepartmentMaxSalary(int departmentNumber) {
        double departmentMaxSalary = Integer.MIN_VALUE;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber && employee.getSalary() > departmentMaxSalary) {
                    departmentMaxSalary = employee.getSalary();
                }
            }
        }
        return departmentMaxSalary;
    }
// метод реализующий поиск максимальной зарплаты по отделу

    public double printDepartmentMinSalary(int departmentNumber) {
        double departmentMinSalary = Integer.MAX_VALUE;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber && employee.getSalary() < departmentMinSalary) {
                    departmentMinSalary = employee.getSalary();
                }
            }
        }
        return departmentMinSalary;
    }
// метод реализующий поиск минимальной зарплаты по отделу


    public double printDepartmentAverageSalary(int departmentNumber) {
        double sum = 0;
        double averageSalary = 0;

        int count1 = 0;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber) {
                    sum += employee.getSalary();
                    count1++;
                    averageSalary = sum / count1;
                }
            }
        }
        return averageSalary;
    }
// метод реализующий поиск средней зарплаты по отделу

    public double printDepartmentSalary(int departmentNumber) {
        double departmentSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber)
                    departmentSalary += employee.getSalary();
            }
        }
        return departmentSalary;
    }
// метод реализующий поиск общей зарплаты по отделу

    public double printDepartmentMinSalaryEmployee(int departmentNumber, double setSalary) {

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber && employee.getSalary() <= setSalary) {
                    System.out.println("Сотрудник с id: " + employee.getId() + ". ФИО  " +
                            employee.getFullNameOfEmployee() + ", зарплата составляет: " +
                            employee.getSalary() + 'р');
                } else if (employee.getDepartment() == departmentNumber) {
                    System.out.println("Сотрудников с зарплатой меньше или равной " + setSalary + "р. В отделе нет.");
                    break;
                }
            }
        }
        return setSalary;
    }
// метод реализующий поиск сотрудников с зарплатой меньше или равной сумме, сумма и отдел задается в параметре.

    public double printDepartmentMaxSalaryEmployee(int departmentNumber, double setSalary) {

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber && employee.getSalary() >= setSalary) {
                    System.out.println("Сотрудник с id: " + employee.getId() + ". ФИО  " +
                            employee.getFullNameOfEmployee() + ", зарплата составляет: " +
                            employee.getSalary() + 'р');
                } else if (employee.getDepartment() == departmentNumber) {
                    System.out.println("Сотрудников с зарплатой больше или равной " + setSalary + "р. В отделе нет.");
                    break;
                }
            }
        }
        return setSalary;
    }
// метод реализующий поиск сотрудников с зарплатой больше или равной сумме, сумма и отдел задается в параметре.

    public void separator() {
        System.out.println("=======================" + "\n");
    }
// метод разделитель

    public String separatorIncrease(String a) {
        System.out.println("+++++++++++++++++++++++");
        System.out.println(a);
        System.out.println("+++++++++++++++++++++++");
        return a;
    }
// метод разделитель с выводом строки с заданным текстом в параметре

    public double printSalary(double salary) {
        System.out.println(salary);
        return salary;
    }
}
// метод для вывода зарплаты