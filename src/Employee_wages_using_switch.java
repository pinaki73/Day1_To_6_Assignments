public class Employee_wages_using_switch {
    public static void main(String[] args) {
        int workinghrs = 0;
        int wageperhr = 100;
        int empwage = 0;
        int days_in_a_month = 20;
        int total_wage = 0;
        for (int i = 0; i < days_in_a_month; i++) {
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case 1:
                    System.out.println("He is a fulltime employee");
                    workinghrs = 8;
                    break;
                case 2:
                    System.out.println("He is a parttime employee");
                    workinghrs = 4;
                    break;
                default:
                    workinghrs = 0;
                    break;
            }
            empwage = workinghrs * wageperhr;
            System.out.println(" ");
            System.out.println(" The wage of the employee is = " + empwage);
            total_wage += empwage;
            System.out.println("The total employee wage for a month is =" +total_wage);
        }
    }
}


