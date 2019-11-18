package day18_lucky;

import java.util.Random;

public class Lucky777 extends Thread {
    private int count;
    private String tName;
    public Lucky777(String tName) {
        setName(tName);
        this.tName = tName;
    }
    
    @Override
    public void run() {
        while (true) {
            count++;
            int number = new Random().nextInt(1000);
            if(number == 777) {
                break;
            }
        }
        System.out.printf("%s 總共取了 %d 次才得到 777\n", tName, count);
    }

    public int getCount() {
        return count;
    }
    
    
    
}
