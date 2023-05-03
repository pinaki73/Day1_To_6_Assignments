public class Employee_wages {
    public static void main(String[] args) {
        int workinghrs = 0;
        int wageperhr = 100;
        int empwage = 0;
        int totalwage = 0;
        int no_of_days = 20;
        for (int i = 0; i < no_of_days; i++) {
            double empcheck = Math.floor(Math.random() * 10) % 2;
            if (empcheck == 1) {
                System.out.println("The employee is present");
            } else {
                System.out.println("The employee is absent");

            }
            if (empcheck == 1) {
                System.out.println("He is a fulltime employee");
                workinghrs = 8;
            } else {
                System.out.println("He is a parttime employee");
                workinghrs = 4;
            }
            empwage = workinghrs * wageperhr;
            System.out.println(" The wage of the employee is = " + empwage);
            totalwage += empwage;
            System.out.println("The total wage for the month is =" + totalwage);
        }
    }
}


