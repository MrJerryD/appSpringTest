package org.example.spring.newfirstappspring;

public class DatabaseConnector {

    private static  DatabaseConnector instance;

    private final String databaseHost;
    private final String databasePort;
    private final String databaseUser;
    private final String databasePassword;

    private DatabaseConnector() {
        this.databaseHost = "http://localhost";
        this.databasePort = "5432";
        this.databaseUser = "admin";
        this.databasePassword = "12345678";
    }

    public static DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public void executeSql(String sql) {
        System.out.println("Connecting to database..." + databaseHost + ":" + databasePort + "?username=" + databaseUser + "&password=" + databasePassword);
        System.out.println("Executing sql: " + sql);
        System.out.println("Provided query was successfully executed.");
    }
}
