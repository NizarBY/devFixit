/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entites.User;
import java.util.ArrayList;

/**
 *
 * @author Who Am I
 */
public interface IUserService {
    public void addUser(User u);
    public void updaterUser (User u );
    public ArrayList<User> getAllUser();
    public User getCnxUser(String login , String password);
    
    
    
}
