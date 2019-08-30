package array;

public class Student {

    private int studentId;
    private String studetName;

    public Student(int studentId){ this.studentId = studentId;
    }
    public Student (int studentId,String studetName){
        this.studentId = studentId;
        this.studetName = studetName;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public String getStudetName(){
        return studetName;
    }
    public void setStudetName(String studetName){
        this.studetName = studetName;
    }
    }
