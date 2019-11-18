package day15_exception;

public class ExceptionDemo_throw {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        try {
            System.out.println(login(username, password));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("結束!");
    }
    
    public static boolean login(String username, String password) throws Exception {
        if(!(username.equals("admin") && password.equals("1234"))) {
            Exception e = new Exception("登入錯誤"); // 受檢例外
            throw e;
        }
        return true;
    }
}
