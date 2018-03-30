package service;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    // SQLite connection string
    static final String url = "jdbc:sqlite:C://sqlite/db/auth.db";
    public static UserList service = new UserList();

    public List<User> findAll() {
        String sql = "SELECT id, name, password, id_role FROM user";
        List<User> users = new ArrayList<>();
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String userName = rs.getString("name");
                String password = rs.getString("password");
                String idRole = rs.getInt("id_role");
//                users.add(idRole);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    public User createUser(String name, String passowrd) {
        String sql = "INSERT INTO user(name,password,id_role) VALUES(?,?,2)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, passowrd);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public void deleteUser(String name) {
        String sql = "DELETE FROM user WHERE name=?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection connect() {
        // SQLite connection string
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
