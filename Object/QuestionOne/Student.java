package Object.QuestionOne;
public class Student {
   private int StudentId;
    private String Name;
    private String MobileNo;
   private String Address;
    private String Course;
    
    public Student(int StudentId, String Name, String MobileNo, String Address, String Course) {
        setStudentId(StudentId);
        setName(Name);
        setMobileNo(MobileNo);
        setAddress(Address);
        setCourse(Course);
    }    

    /**
     * Getters and Setters
     */

     public int getStudentId() {
        return StudentId;
     }

     public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
     }


     public String getName() {
        return Name;
     }

     public void setName(String Name) {
        if (Name.length() <= 15) {
            this.Name = Name;
        } else {
            throw new IllegalArgumentException("Name should not be greater than 15 characters.");
        }
     }

     public String getMobileNo(){
        return MobileNo;
     }

     public void setMobileNo(String MobileNo) {
        if (MobileNo.matches("\\d{10}")) {  
            this.MobileNo = MobileNo;
        } else {
            throw new IllegalArgumentException("Mobile number must have 10 digits.");
        }
     }

     public String getAddress() {
        return Address;
     }

     public void setAddress(String Address) {
        this.Address = Address;
     }

     public String getCourse() {
        return Course;
     }

     public void setCourse(String Course) {
        this.Course = Course;
     }

     /**
      * return fee
      */
     public double CalculateFee() {
        return 0.0;
     }
}
