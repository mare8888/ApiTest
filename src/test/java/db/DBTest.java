package db;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.String.format;

public class DBTest {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/habrdb";
    static final String DB_USER = "postgres";
    static final String DB_PASSWORD = "postgres";

    static Statement statement = null;

    public static void main(String[] args) {
        System.out.println("Try to connection to PostgreSQL");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL driver is not found");
            throw new RuntimeException(e);
        }

        System.out.println("PostgreSQL driver successfully connected");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }

        if (connection != null) {
            System.out.println("Successfully connected to db");
        } else {
            System.out.println("Filed to connect to db");
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        // INSERT
        try {
            statement.executeUpdate("INSERT INTO USERS (name, age) VALUES ('Alice', 23)");
            System.out.println("Alice was successful added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // SELECT
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM  USERS");

            while (rs.next()) {
                String name = rs.getString("name");
                Integer age = rs.getInt("age");

                System.out.println(format("User - {username: %s, age: %d}", name, age));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
