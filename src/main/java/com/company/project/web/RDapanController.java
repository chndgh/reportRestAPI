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
* Created by CodeGenerator on 2018/06/17.
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


    @ApiOperation(value="获取大盘走势", notes="根据后台categoryId,获取该类目下的大盘走势信息,shoptype对应的信息为，" +
            "1001,淘宝市场; 1002,天猫市场; 1003,天猫超市; 1004,天猫国际; 1005,全球购;0,全平台." +
            "month 例子：201805")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "shoptype", value = "平台类型", required = true, dataType = "Long", paramType = "query")
    })
    @GetMapping("/{categoryId}/categoryId/{month}/month/{shoptype}/shoptype")
    public Result getDaPanByBackCategoryId(@PathVariable Long  categoryId,
                                           @PathVariable String month,
                                           @PathVariable Long  shoptype){

        Condition condition =  new Condition(RDapan.class);
        condition.createCriteria().andEqualTo("categoryid",categoryId).andEqualTo("month",month).andEqualTo("shoptype", shoptype);
        RDapan dapan = rDapanService.findByCondition(condition).get(0);
        return  ResultGenerator.genSuccessResult(dapan);
    }

    @ApiIgnore
    @GetMapping("/{categoryId}/categoryId/{season}/season/{shoptype}/shoptype")
    public Result getSeasonDaPanByBackCategoryId(@PathVariable Long  categoryId,
                                           @PathVariable String season,
                                           @PathVariable Long  shoptype){

        return  ResultGenerator.genSuccessResult("to be done");
    }

    @ApiIgnore
    @GetMapping("/{month}/month/{shoptype}/shoptype")
    public Result getAllCategotyMonthly(@PathVariable String month,
                                        @PathVariable Long  shoptype){

        return  ResultGenerator.genSuccessResult("to be done");
    }

    @ApiIgnore
    @GetMapping("/{season}/Season/{shoptype}/shoptype")
    public Result getAllCategotySeasonly(@PathVariable String season,
                                         @PathVariable Long  shoptype){

        return  ResultGenerator.genSuccessResult("to be done");
    }
}
