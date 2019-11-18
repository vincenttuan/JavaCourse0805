package day20_observer;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyData(String data);
}
