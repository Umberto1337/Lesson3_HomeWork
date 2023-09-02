public class Freelancer extends Employee {
    private double hourlyRate;


    public Freelancer(String name, String surName, double hourlyRate, int age) {
        super(name, surName, 0, age);
        this.hourlyRate = hourlyRate;
        this.age = age;

    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {

        return hourlyRate; // Здесь можно реализовать расчет заработной платы фрилансера, если это необходимо
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; По часовая заработная плата (Ставка за час работы) %.0f",
                surName, name, age, hourlyRate);
    }
}

