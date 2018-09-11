package test.aop.service;

import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {

    public void seveUser() {
        System.out.println("serving user");
    }
}
