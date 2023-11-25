package Singleton;

/*
* Singleton design pattern comes handy when we want a single instance of object for a class is needed.
* */
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
