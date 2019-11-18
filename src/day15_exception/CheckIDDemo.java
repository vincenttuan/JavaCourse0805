package day15_exception;

public class CheckIDDemo {
    public static void main(String[] args) {
        String id = "A1234567890";
        try {
            System.out.println(checkId(id));
        } catch (IDException ex) {
            System.out.println(ex.getMessage());
            ex.怎麼辦();
        }
    }
    public static boolean checkId(String id) throws IDException {
        if(id == null || id.length() != 10) {
            IDException e = new IDException("身分證字號錯誤:" + id);
            throw e;
        }
        return true;
    }
}
