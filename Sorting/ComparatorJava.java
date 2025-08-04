
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ComparatorJava {
   static class Data{
        String name;
        int rollno;
        Data(String name, int rollno){
            this.name = name;
            this.rollno = rollno;
        }
    @Override
    public String toString(){
        return name + '-' + rollno;
    }
}
        public static void main(String[] args){
        List<Data> data = new ArrayList<>();
        data.add(new Data("Rajat", 30));
        data.add(new Data("Diksha", 20));
        data.add(new Data("Devansh", 50));
        data.sort((d1, d2)->Integer.compare(d1.rollno, d2.rollno));
      Collections.sort(data, new Comparator<Data>() {
    @Override
    public int compare(Data d1, Data d2) {
        return d2.rollno - d1.rollno;
    }
      });
      for (Data d : data){
        System.out.println(d);
      }
        }
    }
