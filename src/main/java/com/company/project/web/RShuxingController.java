package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RShuxing;
import com.company.project.service.RShuxingService;
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
 * Created by CodeGenerator on 2018/04/29.
 */
@RestController
@RequestMapping("/r/shuxing")
public class RShuxingController {
    @Resource
    private RShuxingService rShuxingService;

    @ApiIgnore
    @PostMapping("/add")
    public Result add(RShuxing rShuxing) {
        rShuxingService.save(rShuxing);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rShuxingService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/update")
    public Result update(RShuxing rShuxing) {
        rShuxingService.update(rShuxing);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RShuxing rShuxing = rShuxingService.findById(id);
        return ResultGenerator.genSuccessResult(rShuxing);
    }

    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RShuxing> list = rShuxingService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @ApiOperation(value = "获取属性分析数据", notes = "根据后台categoryId,获取属性分析数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query")
    })
    @GetMapping("/{categoryId}/categoryId/{month}/month")
    public Result getShuxingByBackCategoryId(@PathVariable Long categoryId,
                                             @PathVariable String month,
                                             @RequestParam String shuxingitem) {
        List<RShuxing> shuxings = rShuxingService.findbyShuxing(categoryId, month, shuxingitem);
        return ResultGenerator.genSuccessResult(shuxings);
    }

}