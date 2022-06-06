import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        for (int i = 1; i <=10000 ; i++) {
            list.add(i);
        }
        MyTask myTask=new MyTask(list);
        executorService.execute(myTask);
    }
}
