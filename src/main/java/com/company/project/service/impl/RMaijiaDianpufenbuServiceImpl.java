package com.company.project.service.impl;

import com.company.project.dao.RMaijiaDianpufenbuMapper;
import com.company.project.model.RMaijiaDianpufenbu;
import com.company.project.service.RMaijiaDianpufenbuService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/17.
 */
@Service
@Transactional
public class RMaijiaDianpufenbuServiceImpl extends AbstractService<RMaijiaDianpufenbu> implements RMaijiaDianpufenbuService {
    @Resource
    private RMaijiaDianpufenbuMapper rMaijiaDianpufenbuMapper;

}
