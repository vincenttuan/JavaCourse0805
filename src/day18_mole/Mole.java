package day18_mole;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Mole extends Thread {
    public static ImageIcon hole, mole1, mole2, mole3, mole4;
    public static ImageIcon[] movie;
    private int dx, delay;
    private JLabel label;
    private JProgressBar bar;
    public boolean stop = false;
    private boolean hit = false;
    
    Mole(JLabel label, int delay, JProgressBar bar){
        if(hole == null) {
            hole= new ImageIcon(getClass().getResource("/day18_mole/hole.png"));
            mole1= new ImageIcon(getClass().getResource("/day18_mole/mole1.png"));
            mole2= new ImageIcon(getClass().getResource("/day18_mole/mole2.png"));
            mole3= new ImageIcon(getClass().getResource("/day18_mole/mole3.png"));
            mole4= new ImageIcon(getClass().getResource("/day18_mole/mole4.png"));
            movie = new ImageIcon[]{hole, mole1, mole2, mole3, mole2, mole1, hole};
        }
        this.label = label;
        this.delay = delay;
        this.bar = bar;
    }

    public void setHit(boolean hit) {
        if(dx == 2 || dx == 3 || dx == 4) {
            this.hit = hit;
            bar.setValue(bar.getValue()-1);
        }
    }
    
    public void job() {
        while (!stop) {
            if(hit) {
                label.setIcon(mole4);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                hit = false;
                // 還有沒有血?
                if(bar.getValue() <= 0) {
                    stop = true;
                }
                continue;
            }
            dx = ++dx % movie.length;
            label.setIcon(movie[dx]);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void run() {
        job();
    }
    
}
