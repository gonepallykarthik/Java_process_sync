package PrototypeDesignPattern;

public class StudentPrototype implements Prototype<StudentPrototype> {
    private String name;
    private String studentId;
    private String email;
    private String batchName;
    private String avgPSP;

    public StudentPrototype() {}
    public StudentPrototype(StudentPrototype s){
        this.batchName = s.batchName;
        this.avgPSP = s.avgPSP;
        this.yearOfgrad = s.yearOfgrad;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getAvgPSP() {
        return avgPSP;
    }

    public void setAvgPSP(String avgPSP) {
        this.avgPSP = avgPSP;
    }

    public String getYearOfgrad() {
        return yearOfgrad;
    }

    public void setYearOfgrad(String yearOfgrad) {
        this.yearOfgrad = yearOfgrad;
    }

    private String yearOfgrad;


    @Override
    public StudentPrototype clone() {
        return new StudentPrototype(this);
    }
}
