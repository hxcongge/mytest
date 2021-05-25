package cn.kgc.demo.controller;


import cn.kgc.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController//值返回数据，不返回试图
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    //异步请求加载员工和部门数据
    @RequestMapping("loadData")
    public Map<String,Object> loadData(Integer page,Integer limit){
       Map<String,Object>map = null;
        try {
            map = empService.findEmpAndDeptByPage(page,limit);
            map.put("code",0);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code",200);
            map.put("msg","数据访问失败");
        }
        return map;
    }


}
