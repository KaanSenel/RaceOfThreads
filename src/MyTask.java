import java.util.ArrayList;
import java.util.List;

public class MyTask implements Runnable {

    List<Integer> list;
    List<Integer> oddNumbers=new ArrayList<>();
    List<Integer> evenNumbers=new ArrayList<>();

    public MyTask(List<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            addOrEven();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void addOrEven(){
        for (int i = 0; i < this.getList().size(); i++) {
            if(this.getList().get(i)%2==0)
                evenNumbers.add(this.getList().get(i));
            else
                oddNumbers.add(this.getList().get(i));
        }
        System.out.println("Çift elemanlar :"+this.getEvenNumbers());
        System.out.println("Tek elemanlar :"+this.getOddNumbers());
    }

    public List<Integer> getList() {
        return list;
    }

    public List<Integer> getOddNumbers(){
        return oddNumbers;
    }

    public List<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}
