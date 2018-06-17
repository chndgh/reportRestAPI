package com.company.project.service.impl;

import com.company.project.dao.RDapanMapper;
import com.company.project.model.RDapan;
import com.company.project.service.RDapanService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/17.
 */
@Service
@Transactional
public class RDapanServiceImpl extends AbstractService<RDapan> implements RDapanService {
    @Resource
    private RDapanMapper rDapanMapper;

}
