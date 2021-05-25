package cn.kgc.demo.dao;

import cn.kgc.demo.pojo.Petinfo;

import java.util.List;

public interface PetinfoMapper {
    int deleteByPrimaryKey(Integer petid);

    int insert(Petinfo record);

    int insertSelective(Petinfo record);

    Petinfo selectByPrimaryKey(Integer petid);

    int updateByPrimaryKeySelective(Petinfo record);

    int updateByPrimaryKey(Petinfo record);

    //嵌套查询-查询宠物信息和品种
    List<Petinfo> selAllPetAndBreed();
}