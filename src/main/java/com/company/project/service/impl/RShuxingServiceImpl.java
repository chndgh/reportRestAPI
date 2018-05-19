package com.company.project.service.impl;

import com.company.project.dao.RShuxingMapper;
import com.company.project.model.RShuxing;
import com.company.project.service.RShuxingService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/04/30.
 */
@Service
@Transactional
public class RShuxingServiceImpl extends AbstractService<RShuxing> implements RShuxingService {
    @Resource
    private RShuxingMapper rShuxingMapper;

    public List<RShuxing> findbyShuxing(Long categoryid, String month, String shuxing){
        return rShuxingMapper.findByShuxingAndCategoryidAndMonth(categoryid,month,shuxing);
    }
}
