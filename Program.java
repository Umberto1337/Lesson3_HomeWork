import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();


    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(200, 500);
        int age = random.nextInt(18, 60);// Генерация случайного возраста
        boolean isFreelancer = random.nextBoolean();

        if (isFreelancer) {
            // Генерация почасовой ставки
            double hourlyRate = 500 + random.nextDouble() * (1000 - 500);
            // Создать случайного Freelancer
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], hourlyRate, age); 
            // Если добавить рандомный способ вывода часов затраченных за месяц у фрилансеров, то тогда получится выводить среднемесячную зарплату а не по часовую. 
        } else {
            // Создать случайного Worker
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex, age);
        }
    }

    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(10);
        System.out.println("Исходный список сотрудников:");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        // Компаратор по возрасту
        Arrays.sort(employees, new AgeComparator());

        System.out.println();
        System.out.println("\nСписок сотрудников после сортировки по возрасту:");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        // Компаратор по заработной плате
        Arrays.sort(employees, new SalaryComparator());

        System.out.println();
        System.out.println("\nСписок сотрудников после сортировки по заработной плате:");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}