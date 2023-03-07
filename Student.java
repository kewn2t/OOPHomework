
public class Student {

    Name name;
    IC ic;
    Address address;
    String schoolname;
    float marks[] = new float[5];
    



    float calcAvg() {
        float sum=0;
        float avg=0;
        for (int i=0;i<5;i++){
            sum+=marks[i];
        }
        avg=sum/5;
        return avg;

    }
    

    
}