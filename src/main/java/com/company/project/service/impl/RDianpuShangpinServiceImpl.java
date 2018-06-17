package com.company.project.service.impl;

import com.company.project.dao.RDianpuShangpinMapper;
import com.company.project.model.RDianpuShangpin;
import com.company.project.service.RDianpuShangpinService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/17.
 */
@Service
@Transactional
public class RDianpuShangpinServiceImpl extends AbstractService<RDianpuShangpin> implements RDianpuShangpinService {
    @Resource
    private RDianpuShangpinMapper rDianpuShangpinMapper;

}
