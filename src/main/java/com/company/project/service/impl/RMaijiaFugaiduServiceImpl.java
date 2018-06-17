package com.company.project.service.impl;

import com.company.project.dao.RMaijiaFugaiduMapper;
import com.company.project.model.RMaijiaFugaidu;
import com.company.project.service.RMaijiaFugaiduService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/17.
 */
@Service
@Transactional
public class RMaijiaFugaiduServiceImpl extends AbstractService<RMaijiaFugaidu> implements RMaijiaFugaiduService {
    @Resource
    private RMaijiaFugaiduMapper rMaijiaFugaiduMapper;

}
