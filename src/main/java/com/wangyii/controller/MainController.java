package com.wangyii.controller;

import com.wangyii.entity.Lecturer;
import com.wangyii.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    LecturerService lecturerService;

    @RequestMapping("/hello")
    public String hello(){
        return "/hello.jsp";
    }
    @RequestMapping("/new")
    public ModelAndView newp(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("num",8);
        return modelAndView;
    }
    @CrossOrigin(value = "*")
    //允许跨域访问
    @RequestMapping("/valid")
    @ResponseBody
    public String valid(String lname,String lpwd){
        int row=lecturerService.varifyLecturer(lname,lpwd);
        System.out.println(row);
        if (row>0){
            return "登录成功";
        }else{
            return "登录失败";
        }

    }
    @CrossOrigin(value = "*")
    @RequestMapping("/getall")
    @ResponseBody
    public List<Lecturer> getAll(){

        return lecturerService.getAll();
    }
}
