package Object.QuestionTwo;

public class PartTimeEmployee  extends Employee{
    public PartTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pinCode) {
       super(empId, basic, allowance, deductions, firstName, lastName, address, pinCode);
    }

    public double CalcSalary() {
         double sal = super.getBasic() - super.getDeductions();
        return sal;
    }
}
