
package com.example.demo.Services;

import com.example.demo.Model.Product;
import com.example.demo.Model.Video;
import com.example.demo.Respotivy.UsertRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.Model.User;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.util.StringUtils;

@Service
public class  UserServices  {
    
    @Autowired
    @Lazy
    private UsertRepository usertRepository;
    
     // GET-ALL
    public List<User> getAllUser() {
        List<User> userd = new ArrayList<>();
        usertRepository.findAll().forEach(userd::add);
        return userd;
    }
    public List<User> getUserName(String username){

        if(!StringUtils.isEmpty(username)) {
            return  usertRepository.findByusername(username);
        }

        return usertRepository.findAll();
    }


    //get by id;
    
      //GET
    public User getUser(Integer userid) {
        return usertRepository.getOne(userid);
    }
    
    // POST
    public void addUser(User us){
         us = new User();
        us.setName(us.getName());
        us.setEmail(us.getEmail());
        us.setUsername(us.getUsername());
        us.setPassword(Encrypt.decrypt(us.getPassword()));
        us.setRole(us.getRole());
        
        usertRepository.save(us);
    }

    // PUT
    public void updateUser(int userid, User user) {
        user.setUserid(userid);
        usertRepository.save(user);
    }

    // DELETE
    public void deleteUser(int userid){
        usertRepository.deleteById(userid);
    }
}
