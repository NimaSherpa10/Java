package Object.QuestionTwo;

public class Employee {
    private int empId;
    private double sal = 0;
    private double basic;
    private double allowance;
    private double deductions;
    private String firstName;
    private String lastName;
    private String address;
    private String pinCode;

    public Employee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pinCode) {
        this.empId = empId;
        this.basic = basic;
        this.allowance = allowance;
        this.deductions = deductions;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pinCode = pinCode;
        this.sal = CalcSalary();
    }


    //read-only salary
    public double getSalary() {
        return sal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and Setter for basic
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    // Getter and Setter for allowance
    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // Getter and Setter for deductions
    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for pinCode
    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String realName() {
        String realName = firstName + " " + lastName;
        if(realName.trim().length() <= 0) {
            throw new IllegalArgumentException("name must be more than 0 characters");
        }
        
        return realName;
    }

    public double CalcSalary() {
        sal = basic + allowance - deductions;
        return sal;
    }

}
