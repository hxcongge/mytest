package cn.test;



import cn.kgc.demo.pojo.Breedinfo;
import cn.kgc.demo.pojo.Dept;
import cn.kgc.demo.pojo.Emp;
import cn.kgc.demo.pojo.Petinfo;
import cn.kgc.demo.service.EmpService;
import cn.kgc.demo.service.PetInfoService;
import com.github.pagehelper.PageInfo;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

//指定在单元测试启动的时候创建spring的工厂类对象
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
//RunWith的value属性指定以spring test的SpringJUnit4ClassRunner作为启动类
//如果不指定启动类，默认启用的junit中的默认启动类
@RunWith(value = SpringJUnit4ClassRunner.class)
public class TestDemo {

    @Autowired
    private EmpService empService;

    @Autowired
    private PetInfoService petInfoService;

    @Test
    public void test1(){
        Map<String,Object> map =empService.findEmpAndDeptByPage(1, 3);
        Long count  = (Long) map.get("count");
        List<Emp> empList= (List<Emp>) map.get("data");
        for (Emp emp:empList){
            System.out.println(emp.getDeptno()+" , "+emp.getEname());
            System.out.println("====================");
            Dept dept = emp.getDept();
            System.out.println(dept);
        }
    }

    @Test
    public void test2(){
        Map<String, Object> map = petInfoService.findPetInfoAndBreed(1, 3);

        List<Petinfo> petinfoList= (List<Petinfo>) map.get("data");
        for (Petinfo p :petinfoList){
            System.out.println(p.getBreedid()+","+ p.getPetname());
            System.out.println("====================");
            Breedinfo breedinfo = p.getBreedinfo();
            System.out.println(breedinfo);
        }
    }
}
