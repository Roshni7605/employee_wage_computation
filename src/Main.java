public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        /**
         * UC-1
         * Check Employee is Present or Absent
         */

        // Constants
        int IS_FULL_TIME = 1;

        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println(empCheck);
            System.out.println("Employee is Present");
        }
        else{
            System.out.println(empCheck);
            System.out.println("Employee is Absent");}
    }
}