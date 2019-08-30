package array;

public class Main {

    public static void main(String[] args) {
        Student[] studentArray = getStudentArray(100);
        for (int i=0; i< studentArray.length; i++){
            System.out.println("This student id for student" + (i+1)
                    + "is" + studentArray[i].getStudentId());
        }

    }

    public static Student[] getStudentArray(int studentSize){
        Student[] studentArray = new Student[studentSize];
        for (int i = 0; i < studentSize; i++) {
            Student student = new Student(i+1);
            studentArray[i] = student;
        }
        return studentArray;
    }
}

     /*  String student1Name = "Bob";
       String studentName2 = "Tim";
      String studentName3 = "Jim";
       String[] student1Names = new String[3];
        student1Names[0] = student1Name;
        student1Names[1] = studentName2;
        student1Names[2] = studentName3;

        System.out.println(bob);

        */



