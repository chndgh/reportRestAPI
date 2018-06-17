package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TBackCategory;
import com.company.project.service.TBackCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/05/19.
*/
@RestController
@RequestMapping("/t/back/category")
public class TBackCategoryController {
    @Resource
    private TBackCategoryService tBackCategoryService;

    @ApiIgnore
    @PostMapping("/add")
    public Result add(TBackCategory tBackCategory) {
        tBackCategoryService.save(tBackCategory);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tBackCategoryService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/update")
    public Result update(TBackCategory tBackCategory) {
        tBackCategoryService.update(tBackCategory);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TBackCategory tBackCategory = tBackCategoryService.findById(id);
        return ResultGenerator.genSuccessResult(tBackCategory);
    }

    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TBackCategory> list = tBackCategoryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value="获取属性分析数据", notes="根据后台categoryId,获取属性分析数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query")
    })
    @GetMapping("/categoryId/{categoryId}")
    public Result getByCategoryId(@PathVariable String categoryId){
        TBackCategory tBackCategory = tBackCategoryService.findBy("cateid",categoryId);
        return ResultGenerator.genSuccessResult(tBackCategory);
    }
}
