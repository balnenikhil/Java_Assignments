package assignment12;

public class Student {
    int studentId;
    String studentName;
    int age;
    String gender;
    String department;
    int batch;
    double aggregate;
    public Student(int studentId, String studentName, int age, String gender, String department, int batch, double aggregate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.batch = batch;
        this.aggregate = aggregate;
    }

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getBatch() {
        return batch;
    }

    public double getAggregate() {
        return aggregate;
    }
    void display(){
        System.out.println(studentId+" "+
                studentName+" "+
                age+" "+
                gender+" "+
                department+" "+
                batch+" "+
                aggregate);
    }
}
