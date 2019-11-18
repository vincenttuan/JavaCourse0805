package day17_thread;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bar extends Thread {
    private ImageIcon[] icons;
    private JLabel jLabel;
    
    Bar(JLabel jLabel) {
        this.jLabel = jLabel;
        ImageIcon apple = new ImageIcon(getClass().getResource("/day17_thread/Apple.png"));
        ImageIcon bar = new ImageIcon(getClass().getResource("/day17_thread/Bar.png"));
        ImageIcon bell = new ImageIcon(getClass().getResource("/day17_thread/Bell.png"));
        ImageIcon seven = new ImageIcon(getClass().getResource("/day17_thread/LuckySeven.png"));
        ImageIcon mango = new ImageIcon(getClass().getResource("/day17_thread/Mango.png"));
        ImageIcon orange = new ImageIcon(getClass().getResource("/day17_thread/Orange.png"));
        ImageIcon star = new ImageIcon(getClass().getResource("/day17_thread/Star.png"));
        ImageIcon melon = new ImageIcon(getClass().getResource("/day17_thread/Watermelon.png"));
        icons = new ImageIcon[]{apple, bar, bell, seven, mango, orange, star, melon};
    }
    
    @Override
    public void run() {
        job();
    }
    
    
    public void job() {
        for(int i=1;i<=300_0000;i++) {
            int n = new Random().nextInt(icons.length);
            jLabel.setIcon(icons[n]);
        }
        //jLabel.setIcon(icons[7]);
    }
    
}
