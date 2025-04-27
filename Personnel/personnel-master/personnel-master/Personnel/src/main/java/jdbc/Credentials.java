package jdbc;

public class Credentials {
    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "localhost";
    private static final String DATABASE = "personnel";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static String getDriverClassName() {
        return DRIVER_CLASS_NAME;
    }

    public static String getUrl() {
        return "jdbc:mysql://" + HOST + "/" + DATABASE;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }
} 