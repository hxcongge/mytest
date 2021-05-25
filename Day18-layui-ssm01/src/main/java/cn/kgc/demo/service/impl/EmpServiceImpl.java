package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.EmpMapper;
import cn.kgc.demo.pojo.Emp;
import cn.kgc.demo.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = false)
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Map<String, Object> findEmpAndDeptByPage(Integer page, Integer limit) {
        Map<String,Object> map = new HashMap<>();
        //开启分页查询
        PageHelper.startPage(page,limit);
        //查询数据  嵌套查询-懒加载
        List<Emp> list = empMapper.selAllEmpAndDept();
        //封装数据
        PageInfo pageInfo=new PageInfo(list);
        map.put("count", pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
}
