package oops;

public class Static {
    // Static keyword is used when all the instances of a particular class need to have only one value
    // ex. schoolName can be static as all instances of school ie students must have same school name
}

class School {
    static String schoolName;
    String studentName;

    School(String sName) {
        this.studentName = sName;
    }

    void setSchoolName() {
        schoolName = "Angel High School";
    }

    void getSchoolName() {
        System.out.println(schoolName);
    }

    public static void main(String[] args) {
        School.schoolName = "Genius";
        School student1 = new School("Abhishek");
        School student2 = new School("Abhishek");
        School student3 = new School("Abhishek");
        student1.getSchoolName();
        student2.getSchoolName();
        student2.setSchoolName();
        student3.getSchoolName();
        student1.getSchoolName();
    }
}

