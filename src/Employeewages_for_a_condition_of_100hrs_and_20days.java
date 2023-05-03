public class Employeewages_for_a_condition_of_100hrs_and_20days {
    public static void main(String[] args) {
        int workinghrs = 0;
        int wageperhr = 100;
        int total_emp_wage = 0;
        int total_working_hrs = 0;
        int total_working_days = 0;
        int no_of_working_days= 20;
        int maximum_working_hrs = 100;
        while (total_working_hrs <= maximum_working_hrs && total_working_days < no_of_working_days) {
            total_working_days++;
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
            total_working_hrs += workinghrs;
            System.out.println("Total working days = "+total_working_days+" "+"Employee working hours ="+" "+workinghrs);
        }
        total_emp_wage = total_working_hrs * wageperhr;
        System.out.println(" Total employee wage = "+total_emp_wage);
    }
}


