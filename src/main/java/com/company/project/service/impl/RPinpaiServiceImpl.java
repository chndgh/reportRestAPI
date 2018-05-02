package com.company.project.service.impl;

import com.company.project.dao.RPinpaiMapper;
import com.company.project.model.RPinpai;
import com.company.project.service.RPinpaiService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/30.
 */
@Service
@Transactional
public class RPinpaiServiceImpl extends AbstractService<RPinpai> implements RPinpaiService {
    @Resource
    private RPinpaiMapper rPinpaiMapper;

}
