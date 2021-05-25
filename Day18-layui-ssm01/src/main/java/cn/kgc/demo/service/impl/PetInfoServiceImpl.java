package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.PetinfoMapper;
import cn.kgc.demo.pojo.Petinfo;
import cn.kgc.demo.service.PetInfoService;
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
public class PetInfoServiceImpl implements PetInfoService {
    @Autowired
    private PetinfoMapper petinfoMapper;

    @Override
    public Map<String, Object> findPetInfoAndBreed(Integer page, Integer limit) {
        Map<String,Object> map =new HashMap<>();
        PageHelper.startPage(page,limit);
        List<Petinfo> list = petinfoMapper.selAllPetAndBreed();
        PageInfo pageInfo = new PageInfo(list);
        map.put("count", pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
}
