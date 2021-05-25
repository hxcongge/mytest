package cn.kgc.demo.service;

import java.util.Map;

public interface PetInfoService {
    Map<String, Object> findPetInfoAndBreed(Integer page, Integer limit);
}
