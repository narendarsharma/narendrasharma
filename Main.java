
//write  a programme to construct the map to store the name of student and their examination grades. write a program to demonstration a correction in the marks of  a student and display it.
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Akash",45);
        map.put("Vishal",60);
        map.put("Krishna",75);
        map.put("Abinav",32);
        System.out.println("Marks before the correction");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m);
        }
        map.replace("Abinav",82);
        System.out.println("Marks after correction ");
        for (Map.Entry m: map.entrySet()){
            System.out.println(m);
        }

    }
}