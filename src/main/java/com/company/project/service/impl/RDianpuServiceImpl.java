package com.company.project.service.impl;

import com.company.project.dao.RDianpuMapper;
import com.company.project.model.RDianpu;
import com.company.project.service.RDianpuService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/30.
 */
@Service
@Transactional
public class RDianpuServiceImpl extends AbstractService<RDianpu> implements RDianpuService {
    @Resource
    private RDianpuMapper rDianpuMapper;

}
