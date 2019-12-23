package dao.impl;

import dao.IUserPageDao;
import data.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserPageDaoImpl implements IUserPageDao {
    int count = 5;

    @Override
    public int getTotal() {
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=utf8", "root", "root");
            String sql = "select count(*) from students1";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
            statement.close();
            con.close();
        } catch (Exception e) {

        }
        return count;
    }

    @Override
    public User get(int id) {
        User user = new User();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=utf8", "root", "root");
            String sql = "select * from students1 where id = " + id;
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String addr = rs.getString("addr");
                int grade = rs.getInt("grade");
                String course = rs.getString("course");
                user.setId(id);
                user.setName(name);
                user.setAddr(addr);
                user.setCourse(course);
                user.setGender(gender);
                user.setGrade(grade);
            }
            statement.close();
            con.close();
        } catch (Exception e) {

        }
        return user;
    }

    @Override
    public boolean removeById(int id) {
        boolean isSuccess = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=utf8", "root", "root");
            String sql = "delete from students1 where id = " + id;
            PreparedStatement statement = con.prepareStatement(sql);
            isSuccess = (statement.executeUpdate() > 0);
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("error");
        }
        return isSuccess;
    }

    @Override
    public boolean update(User user) {
        boolean isUpdate = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=utf8", "root", "root");
            String sql = "update students1 set name=" + "\'" + user.getName() + "\'" + "," +
                    "gender=" + "\'" + user.getGender() + "\'" + "," +
                    "addr=" + "\'" + user.getAddr() + "\'" + "," +
                    "grade=" + "\'" + user.getGrade() + "\'" + "," +
                    "course=" + "\'" + user.getCourse() + "\'" + " where id = " + user.getId();
            PreparedStatement statement = con.prepareStatement(sql);
            isUpdate = (statement.executeUpdate() > 0);
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return isUpdate;
    }

    @Override
    public boolean insert(User user) {
        boolean isInsert = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=utf8", "root", "root");
            String sql = "insert into students1 values (" + user.getId() + "," +
                    "\'" + user.getName() + "\'" + "," +
                    "\'" + user.getGender() + "\'" + "," +
                    "\'" + user.getAddr() + "\'" + "," +
                    user.getGrade() + "," +
                    "\'" + user.getCourse() + "\'" + ")";
            PreparedStatement statement = con.prepareStatement(sql);
            isInsert = (statement.executeUpdate() > 0);
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return isInsert;
    }

    @Override
    public List<User> list() {
        return list(0, count);
    }

    @Override
    public List<User> list(int start, int count) {
        List<User> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=utf-8", "root", "root");
            String sql = "select * from students1 order by id asc limit ?,?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, start);
            statement.setInt(2, count);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String addr = rs.getString("addr");
                int grade = rs.getInt("grade");
                String course = rs.getString("course");
                user.setId(id);
                user.setName(name);
                user.setAddr(addr);
                user.setCourse(course);
                user.setGender(gender);
                user.setGrade(grade);
                list.add(user);
            }
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("error");
        }
        return list;
    }
}
