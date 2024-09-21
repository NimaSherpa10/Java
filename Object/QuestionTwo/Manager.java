package Object.QuestionTwo;

public class Manager extends NightShiftEmployee {
    public Manager(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pinCode, double cabAllowance) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pinCode, cabAllowance);
    }

    @Override
    public double CalcSalary() {

        double baseSalary = super.CalcSalary();
        double managerBonus = 1000; 
        return baseSalary + managerBonus; 
    }

}
