package Singleton;

public class DB {
    private static DB connection;
    private DB(){

    }

    public static DB getConnection(){
        if(connection==null){
            synchronized (DB.class){
                if(connection == null){
                    connection = new DB();
                }
            }
        }
        return connection;
    }
}
