package DAO;

import Model.Food;
import Model.User;
import java.sql.*;
import java.util.ArrayList;

public class ConnectionSQL {

    protected Connection connection;

    public ConnectionSQL() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CoffeeManagementJava;user=sa;password=123;encrypt=true;trustServerCertificate=true;");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DAO.ConnectionSQL();
    }

    ///////////////////////////// Write data to datebase SQL
    public boolean addUserToDb(User user) {
        try {
            String sql = "INSERT INTO dbo.UserTable(userName, passWord,email)" + "VALUES(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassWord());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhoneNumber());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    ////////////////// Read data from database SQL
    public ArrayList<User> getListUser() {
        ArrayList<User> userList = new ArrayList<>();

        try {

            String sql = "SELECT * FROM dbo.UserTable";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("userName"));
                user.setPassWord(rs.getString("passWord"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNumber(rs.getString("phone"));
                System.out.println("userName: " + user.getUserName());
                System.out.println("password: " + user.getPassWord());
                System.out.println("email   : " + user.getEmail());
                System.out.println("phone number: " + user.getPhoneNumber());

                userList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;

    }

    ////////////////////Update data 
    public boolean updateData(String userName, String newpassword) {
        try {
            String sql = "UPDATE dbo.UserTable SET passWord = ? WHERE userName = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(2, userName);
            ps.setString(1, newpassword);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//////////////////////// add food to dâtabase
    public boolean addFoodToSQL(Food food) {
        String sql = "INSERT INTO dbo.FoodTable(id,category,food,price)" + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, food.getId());
            ps.setString(2, food.getCategory());
            ps.setString(3, food.getFood());
            ps.setFloat(4, food.getPrice());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    //////////////////////////////// Read data from database
    public ArrayList<Food> getListFood() {
        ArrayList<Food> foodList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.FoodTable";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Food food = new Food();
                food.setId(rs.getInt("id"));
                food.setCategory(rs.getString("category"));
                food.setFood(rs.getString("food"));
                food.setPrice(rs.getFloat("price"));
                foodList.add(food);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodList;
    }

    ////////////////delete row from database
    public void delete(String id) {
        String sql = "DELETE FROM dbo.FoodTable WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id); // Thiết lập tham số cho câu lệnh SQL
            ps.executeUpdate();  // Thực thi lệnh xóa
        } catch (Exception e) {
            e.printStackTrace(); // In ra lỗi nếu có
        }
    }
}
