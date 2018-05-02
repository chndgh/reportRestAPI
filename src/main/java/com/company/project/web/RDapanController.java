package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RDapan;
import com.company.project.service.RDapanService;
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
@RequestMapping("/r/dapan")
public class RDapanController {
    @Resource
    private RDapanService rDapanService;
    @ApiIgnore
    @PostMapping("/add")
    public Result add(RDapan rDapan) {
        rDapanService.save(rDapan);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rDapanService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/update")
    public Result update(RDapan rDapan) {
        rDapanService.update(rDapan);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RDapan rDapan = rDapanService.findById(id);
        return ResultGenerator.genSuccessResult(rDapan);
    }
    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RDapan> list = rDapanService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @ApiOperation(value="获取大盘走势", notes="根据后台categoryId,获取大盘走势信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query")
    })
    @GetMapping("/categoryId")
    public Result getDaPanByBackCategoryId(@RequestParam Long  categoryId,
                                           @RequestParam String month){

        Condition condition =  new Condition(RDapan.class);
        condition.createCriteria().andEqualTo("categoryId",categoryId).andEqualTo("month",month);
        RDapan dapan = rDapanService.findByCondition(condition).get(0);
        return  ResultGenerator.genSuccessResult(dapan);
    }
}
