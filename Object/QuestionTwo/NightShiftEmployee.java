package Object.QuestionTwo;

public class NightShiftEmployee extends Employee {
    private double cabAllowance;

    public NightShiftEmployee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pinCode, double cabAllowance) {
        super(empId, basic, cabAllowance, deductions, firstName, lastName, address, pinCode);
        this.cabAllowance = cabAllowance;
        
       
    }
    public double getCabAllowance() {
        return cabAllowance;
    }

    public void setCabAllowance(double cabAllowance) {
        this.cabAllowance = cabAllowance;
    }

    @Override
    public double CalcSalary() {
        return super.CalcSalary() + cabAllowance; 
    }
}