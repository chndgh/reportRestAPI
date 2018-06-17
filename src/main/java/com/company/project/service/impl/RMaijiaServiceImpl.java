package com.company.project.service.impl;

import com.company.project.dao.RMaijiaMapper;
import com.company.project.model.RMaijia;
import com.company.project.service.RMaijiaService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/17.
 */
@Service
@Transactional
public class RMaijiaServiceImpl extends AbstractService<RMaijia> implements RMaijiaService {
    @Resource
    private RMaijiaMapper rMaijiaMapper;

}
