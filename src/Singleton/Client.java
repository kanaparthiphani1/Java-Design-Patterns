package Singleton;

public class Client {
    public static void main(String[] args) {

        DB instance = DB.getConnection();
    }

}
