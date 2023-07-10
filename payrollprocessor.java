
class Employee {
    int days;
    int hours;
    double salary;
    String name;
    double hourlyRate;
    double hoursWorked;
    public void calculatePay(String name , int salary){
        System.out.println(salary*days);

    
    }
    public void calculatePay(String name,double hourlyRate, double hoursWorked){
        System.out.println(hourlyRate*hoursWorked);
    }
    class main {
        public static void main(String[] args) {
            
            Employee employee = new Employee();
            employee.calculatePay("Janu",60000);
            employee.calculatePay("Janu",3,8);

        }
    }
    
}
