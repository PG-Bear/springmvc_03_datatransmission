package icu.insomniac.datatransmission.controller;

import icu.insomniac.datatransmission.main.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/nparam")
    @ResponseBody
    public String getNormalParam(String username, int age){
        System.out.println(username+", "+age);
        return username+", "+age;
    }

    @RequestMapping("/nparamdt")
    @ResponseBody
    public String getNormalParamDt(@RequestParam("name") String username, int age){
        System.out.println(username+", "+age);
        return username+", "+age;
    }

    @RequestMapping("/pojoparam")
    @ResponseBody
    public String getPojoParam(User user){
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/cpojoparam")
    @ResponseBody
    public String getCPojoParam(User user){
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/arrayparam")
    @ResponseBody
    public String getArrayParam(String[] username){
        List<String> un = new ArrayList<>();
        for (String u : username){
            un.add(u);
        }
        System.out.println(un);
        return un.toString();
    }

    @RequestMapping("/collectionparam")
    @ResponseBody
    public String getCollectionParam(@RequestParam List<String> username){
        System.out.println(username);
        return username.toString();
    }
}
