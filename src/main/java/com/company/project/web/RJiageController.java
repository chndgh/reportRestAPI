package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RJiage;
import com.company.project.service.RJiageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/04/29.
*/
@RestController
@RequestMapping("/r/jiage")
public class RJiageController {
    @Resource
    private RJiageService rJiageService;
    @ApiIgnore
    @PostMapping("/add")
    public Result add(RJiage rJiage) {
        rJiageService.save(rJiage);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rJiageService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/update")
    public Result update(RJiage rJiage) {
        rJiageService.update(rJiage);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RJiage rJiage = rJiageService.findById(id);
        return ResultGenerator.genSuccessResult(rJiage);
    }
    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RJiage> list = rJiageService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @ApiOperation(value="获取价格分析数据", notes="根据后台categoryId, 获取价格分析数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query")
    })
    @GetMapping("/categoryId")
    public Result getJiageBackCategoryId(@RequestParam Long  categoryId,
                                           @RequestParam String month){
        Condition condition =  new Condition(RJiage.class);
        condition.createCriteria().andEqualTo("categoryid",categoryId).andEqualTo("month",month);
        List<RJiage> jiages = rJiageService.findByCondition(condition);
        return  ResultGenerator.genSuccessResult(jiages);
    }
}
