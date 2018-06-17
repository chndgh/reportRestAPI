package com.company.project.service.impl;

import com.company.project.dao.RJiageMapper;
import com.company.project.model.RJiage;
import com.company.project.service.RJiageService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/17.
 */
@Service
@Transactional
public class RJiageServiceImpl extends AbstractService<RJiage> implements RJiageService {
    @Resource
    private RJiageMapper rJiageMapper;

}
