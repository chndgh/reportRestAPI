package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.RShuxing;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RShuxingMapper extends Mapper<RShuxing> {

    @Select("select * from r_shuxing where categoryid=#{categoryid} and month=#{month} and shuxing=#{shuxing} order by xiaoshoue desc limit 10")
    public List<RShuxing> findByShuxingAndCategoryidAndMonth(@Param("categoryid") Long categoryid,
                                                             @Param("month") String month,
                                                             @Param("shuxing") String shuxing);
}