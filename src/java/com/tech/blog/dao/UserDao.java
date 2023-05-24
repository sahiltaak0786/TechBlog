//iss userdao m hum esa function bnaaenge jo ki database m values ko daal raha hoga/insert kar raha hoga
package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;

public class UserDao {

    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    //method to insert user to database:\
    //bde vala "User" is User.java Class hai or chhote vala "user" is constructor user h jo 3 humne User.java m bnaaye the 
    public boolean saveUser(User user) {
        boolean f = false;
        try {
            //here we write the code user-->> database
            String query = "insert into user(name,email,password,gender,about) values (?,?,?,?,?)";
            PreparedStatement pstmt = this.con.prepareStatement(query);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5, user.getAbout());

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }

    //get user by useremail and userpassword
    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;//here initially user is null so we will set value in user in below program now let' see.
        try {
            String query = "select * from user where email=? and password=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            ResultSet set = pstmt.executeQuery();//sara daata ab set m aagya hai
            if (set.next()) {
                user = new User();
                
                String name = set.getString("name");//nikaling name from database ;
                user.setName(name);//set this name to user's object
                
                //now to directly with other columns
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setRdate(set.getTimestamp("rdate"));
                user.setProfile(set.getString("profile"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

}
