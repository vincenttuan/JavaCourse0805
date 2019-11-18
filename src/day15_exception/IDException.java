package day15_exception;

public class IDException extends Exception {

    public IDException(String message) {
        super(message);
    }
    
    public void 怎麼辦() {
        System.out.println("請重新輸入...");
    }
    
}
