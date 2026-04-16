package Day3;

public class EmployeeWage {
    public static void main(String[] args) {

        int isPresent = (int)(Math.random() * 2); // 0 or 1

        int wagePerHour = 20;
        int fullDayHours = 8;

        if(isPresent == 1) {
            int dailyWage = wagePerHour * fullDayHours;
            System.out.println("Employee Present. Wage = " + dailyWage);
        } else {
            System.out.println("Employee Absent. Wage = 0");
        }
    }
}