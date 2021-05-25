package cn.kgc.demo.dao;

import cn.kgc.demo.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    //嵌套查询-查询员工和部门数据
    List<Emp> selAllEmpAndDept();

}