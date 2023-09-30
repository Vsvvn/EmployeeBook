public class Main {




    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();


        employeeBook.addEmployees("Иван Иванович Иванов ", 1, 55555);
        employeeBook.addEmployees("Маргарита Иванновна Иванова", 1, 76000);
        employeeBook.addEmployees("Евгений Алексеевич Савушкин", 3, 97300);
        employeeBook.addEmployees("Мария Александровна Петрова", 2, 80000);
        employeeBook.addEmployees("Денис Иваннович Алексеев", 3, 77000);
        employeeBook.addEmployees("Алексей Алексеевич Денисов", 4, 79000);
        employeeBook.addEmployees("Алексей Александрович Денисов", 5, 89000);
        employeeBook.addEmployees("Анна Евгеньевна Денисова", 5, 81000);
        employeeBook.addEmployees("Александра Алексеевна Савушкина", 3, 97000);


        employeeBook.separatorIncrease("Изменение сотрудника.");
//  Изменить сотрудника. Получить сотрудника по Ф. И. О., изменить зарлплату и отдел можно в параметрах
        employeeBook.changeSalaryAndDepartment("Евгений Алексеевич Савушкин",60000,1);
        employeeBook.separator();

        employeeBook.separatorIncrease("Удаление сотрудника");
//  Удалить сотрудника
        employeeBook.removeEmployee(1);
        employeeBook.separator();

        employeeBook.separatorIncrease("Список всех сотрудников по всем отделам либо всех сотрудников по конкретному отделу.");
//  Получить список всех сотрудников по отделу либо по конкретному отделу можно с помощью параметра request. По ключевым
//  фразам "Список всех сотрудников по всем отделам" и "Список сотрудников по конкретному отделу" соответственно.
//  Параметр отдела задавать только для конкретного отдела.
        employeeBook.GetFullNameAllEmployeesByDepartment("Список сотрудников по конкретному отделу",5);
        employeeBook.separator();


//  =======Класс Employee===============================================================================================
//  можно раскомментировать для проверки работы

//        Employee ivan = new Employee("Иван Иванович Иванов ", 1, 55555);
//        Employee marg = new Employee("Маргарита Иванновна Иванова", 1, 76000);
//        Employee evgeniy = new Employee("Евгений Алексеевич Савушкин", 3, 97300);
//        Employee mariaAlexandr = new Employee("Мария Александровна Петрова", 2, 80000);
//        Employee denis = new Employee("Денис Иваннович Алексеев", 3, 97000);
//        Employee alexeyAlexey = new Employee("Алексей Алексеевич Денисов", 4, 79000);
//        Employee alexeyAlexandr = new Employee("Алексей Александрович Денисов", 5, 89000);
//        Employee mariaDenis = new Employee("Мария Денисовна Денисова", 5, 81000);
//        Employee alexandra = new Employee("Александра Алексеевна Денисова", 3, 79000);


//  Изменение отдела в классе Employee
//        ivan.setDepartment(8);

//  Изменение зарплаты в классе Employee
//        ivan.setSalary(65555);

//  Проверка изменений в классе Employee
//        System.out.println(ivan);
//  ====================================================================================================================


        employeeBook.separatorIncrease("id, Ф.И.О, номер отдела и зарплата сотрудника.");
        employeeBook.print();
//  id, Ф.И.О, номер отдела и зарплата сотрудника

        employeeBook.separator();
        employeeBook.separatorIncrease("Зарплата: Максимальная, минимальная, средняя, общая.");

        employeeBook.printSalary(employeeBook.maxSalary());
//  Максимальная зарплата

        employeeBook.printSalary(employeeBook.minSalary());
//  Минимальная зарплата

        employeeBook.printSalary(employeeBook.averageSalary());
//  Средняя зарплата

        employeeBook.printSalary(employeeBook.totalSalary());
//  Общая зарпалата

        employeeBook.separator();
        employeeBook.separatorIncrease("Индексированная зарплата: Максимальная, минимальная, средняя, общая.");

        employeeBook.printSalary(employeeBook.salaryIndex(employeeBook.maxSalary(), 1));
//  Максимальная зарплата проиндексированная, процент можно задать в параметре.

        employeeBook.printSalary(employeeBook.salaryIndex(employeeBook.minSalary(), 1));
//  Минимальная зарплата проиндексированная, процент можно задать в параметре.

        employeeBook.printSalary(employeeBook.salaryIndex(employeeBook.averageSalary(), 1));
//  Средняя зарплата проиндексированная, процент можно задать в параметре.

        employeeBook. printSalary(employeeBook.salaryIndex(employeeBook.totalSalary(), 1));
//  Общая зарплата проиндексированная, процент можно задать в параметре.

        employeeBook.separator();
        employeeBook.separatorIncrease("Зарплата сотрудника в конкретном отделе с указанием № отдела.");
//  id, Ф.И.О, и зарплата сотрудника в конкретном отделе. Номер отдела можно задать в параметре.
        employeeBook.printDepartment(3);


        employeeBook.separator();
        employeeBook.separatorIncrease("Зарплата сотрудника в конкретном отделе без указаниея № отдела.");
//  id, Ф.И.О, и зарплата сотрудника в конкретном отделе. Номер отдела можно задать в параметре. Номер отдела не указывается.
        employeeBook.printDepartmentWithoutNumber(3);

        employeeBook.separator();
        employeeBook.separatorIncrease("Индексированная зарплата по отделу: Максимальная, минимальная, средняя, общая.");
//  Максимальная зарплата по отделу проиндексированная, процент и отдел можно задать в параметре.
        employeeBook.printSalary(employeeBook.salaryIndex(employeeBook.printDepartmentMaxSalary(3), 1));

        employeeBook.printSalary(employeeBook.salaryIndex(employeeBook.printDepartmentMinSalary(3), 1));
//  Маинимальная зарплата по отделу проиндексированная, процент и отдел можно задать в параметре.

        employeeBook.printSalary(employeeBook.salaryIndex(employeeBook.printDepartmentAverageSalary(3), 1));
//  Средняя зарплата по отделу проиндексированная, процент и отдел можно задать в параметре.

        employeeBook.printSalary(employeeBook.salaryIndex(employeeBook.printDepartmentSalary(3), 1));
//  Общая зарплата по отделу проиндексированная, процент и отдел можно задать в параметре.

        employeeBook.separator();
        employeeBook.separatorIncrease("Поиск сотрудников по зарплате меньше или равной сумме задаваемого числа");
//        Поиск сотрудников с зарплатой меньше или равной сумме, сумма и отдел задается в параметре.
        employeeBook.printDepartmentMinSalaryEmployee(3, 5000);

        employeeBook.separator();
        employeeBook.separatorIncrease("Поиск сотрудников по зарплате больше или равной сумме задаваемого числа");
//        Поиск сотрудников с зарплатой больше или равной сумме, сумма и отдел задается в параметре.
        employeeBook.printDepartmentMaxSalaryEmployee(3, 10000);
    }
}