package com.sunshine.free.controller;

import com.sunshine.free.entity.User;
import com.sunshine.free.utils.CommonResponse;
import com.sunshine.free.utils.ResponseTypeEnums;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Free
 * @date 2019-06-26
 */

@Controller
public class FrontIndexController {

    @RequestMapping(value = "/getProject", method =RequestMethod.POST)
    public @ResponseBody CommonResponse<User> getProject(User user){

        System.out.println(user);
        return new CommonResponse<>(ResponseTypeEnums.SUCCESS,null,null,user);
    }
}
