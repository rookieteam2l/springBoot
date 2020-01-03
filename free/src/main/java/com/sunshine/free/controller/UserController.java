package com.sunshine.free.controller;

import com.sunshine.free.entity.User;
import com.sunshine.free.dao.UserMapper;
import com.sunshine.free.utils.CommonResponse;
import com.sunshine.free.utils.ResponseTypeEnums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * sql查询练习
 *
 * @author Free
 * @date 2019-06-20
 */

@RestController
@RequestMapping("/user/*")
public class UserController {


    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;

    @GetMapping("list")
    public List<User> list() {
        List<User> list = userMapper.list();
        System.out.println(list);
        return userMapper.list();
    }


    @RequestMapping(value = "/login1",method = RequestMethod.POST)
    public @ResponseBody
    CommonResponse login(HttpServletRequest req , User user){

        User record = new User();
        String userId = user.getUserId();
        record.setUsername("lisi");
       return new CommonResponse<User>(ResponseTypeEnums.SUCCESS,null,null,record);
    }

    @GetMapping("list/{username}")
    public List<User> listByUsername(@PathVariable("username") String username) {
        return userMapper.listByUsername(username);
    }

    @GetMapping("get/{username}/{password}")
    public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.get(username, password);
    }

    @GetMapping("get/bad/{username}/{password}")
    public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.getBadUser(username, password);
    }

}
