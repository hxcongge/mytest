package cn.kgc.demo.controller;
/*
* 专门用于试图的控制器
* */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("model")
public class ModelController {
    //跳转到员工和部门页面

    @RequestMapping("showEmpUI")
    public String showEmpUI(){
        return "showEmp";
    }

     //跳转到宠物和宠物信息页面
    @RequestMapping("showPetInfoUI")
    public String showPetInfoUI(){
        return "showPetInfo";
    }
}
