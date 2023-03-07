import java.util.ArrayList;

public class TuitionCentre {

    Address address;
    private String headmaster;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Teacher> teacherList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public String getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(String headmaster) {
        this.headmaster = headmaster;
    }

    float avgMarks() {
        float sum=0;
        float avg=0;
        for (int i = 0; i < studentList.size(); i++ ){
            sum += studentList.get(i).calcAvg();
        }
        avg=avgMarks();
        return avg;

    }


    String minMarks() {
        float lowestMark= 100;
        for (int i = 0; i < studentList.size(); i++ ){
            if (studentList.get(i).calcAvg() <= lowestMark){
                lowestMark = studentList.get(i).calcAvg();

            }
        }
        return "Lowest mark is " + lowestMark;
    }

    String maxMarks(){
        float highestMark=0;
        for (int i = 0; i < studentList.size(); i++ ){
            if (studentList.get(i).calcAvg() >= highestMark){
                highestMark = studentList.get(i).calcAvg();
            }
        }
        return "Highest mark is " + highestMark;
    }
}
