package com.company.project.service;
import com.company.project.model.RShuxing;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/06/17.
 */
public interface RShuxingService extends Service<RShuxing> {
    public List<RShuxing> findbyShuxing(Long categoryid, String month, String shuxing);
}
