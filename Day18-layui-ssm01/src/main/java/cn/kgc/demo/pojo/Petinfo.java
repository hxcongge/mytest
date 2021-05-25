package cn.kgc.demo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Petinfo {
    private Integer petid;

    private String petname;

    private Integer breedid;

    private Integer petsex;

    private Date birthday;

    private String description;

    //引入BreedInfo实体
    private Breedinfo breedinfo;

}