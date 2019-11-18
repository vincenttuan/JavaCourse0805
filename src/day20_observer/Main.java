package day20_observer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        Subject news = new NewsSubject();
        Observer user1 = new UserObserver("小明");
        Observer user2 = new UserObserver("小華");
        Observer user3 = new UserObserver("小英");
        
        System.out.println("有 3 人訂閱");
        news.add(user1);
        news.add(user2);
        news.add(user3);
        Thread.sleep(3000);
        System.out.println("發送新聞");
        Thread.sleep(3000);
        news.notifyData("免費去日本");
        
        System.out.println("有 1 人退訂");
        news.remove(user2);
        Thread.sleep(3000);
        System.out.println("發送新聞");
        Thread.sleep(3000);
        news.notifyData("免費去台灣");
    }
}

