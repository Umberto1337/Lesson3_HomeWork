public class Worker extends Employee{
    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
        this.age = age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Возраст: %d; Среднемесячная заработная плата (фиксированная) %.2f",
                surName, name, age, salary);
    }
}