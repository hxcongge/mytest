package cn.kgc.demo.service;

import java.util.Map;

public interface EmpService {
    Map<String, Object> findEmpAndDeptByPage(Integer page, Integer limit);
}
