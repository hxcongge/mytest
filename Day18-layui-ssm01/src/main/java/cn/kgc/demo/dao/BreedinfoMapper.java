package cn.kgc.demo.dao;

import cn.kgc.demo.pojo.Breedinfo;
import lombok.Data;


public interface BreedinfoMapper {
    int deleteByPrimaryKey(Integer breedid);

    int insert(Breedinfo record);

    int insertSelective(Breedinfo record);

    Breedinfo selectByPrimaryKey(Integer breedid);

    int updateByPrimaryKeySelective(Breedinfo record);

    int updateByPrimaryKey(Breedinfo record);
}