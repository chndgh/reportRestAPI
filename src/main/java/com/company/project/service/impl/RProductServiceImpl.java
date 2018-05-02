package com.company.project.service.impl;

import com.company.project.dao.RProductMapper;
import com.company.project.model.RProduct;
import com.company.project.service.RProductService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/30.
 */
@Service
@Transactional
public class RProductServiceImpl extends AbstractService<RProduct> implements RProductService {
    @Resource
    private RProductMapper rProductMapper;

}
