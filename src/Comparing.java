import java.sql.Time;
import java.util.*;

public class Comparing {
    private List<Integer> AList = new ArrayList<>();
    private List<Integer> LList = new LinkedList<>();
    private long start;
    private long end;


    public void compare(int countOfValues){
        System.out.println(countOfValues + " values: ");

        for (int i = 0; i  < countOfValues; i++){
            AList.add(new Random().nextInt());
            LList.add(new Random().nextInt());
        }

        start = System.currentTimeMillis();
        Collections.sort(AList);
        end = System.currentTimeMillis();
        System.out.println("Array List time = " + (end - start));

        start = System.currentTimeMillis();
        Collections.sort(LList);
        end = System.currentTimeMillis();
        System.out.println("Linked List time = " + (end - start));

        AList.clear();
        LList.clear();

    }
}
