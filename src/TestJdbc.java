public class TestJdbc {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动加载成功");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
