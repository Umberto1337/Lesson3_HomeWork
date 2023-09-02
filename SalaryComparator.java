import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        double salary1 = o1.calculateSalary();
        double salary2 = o2.calculateSalary();

        if (salary1 < salary2) {
            return -1;
        } else if (salary1 > salary2) {
            return 1;
        } else {
            return 0;
        }
    }
}
