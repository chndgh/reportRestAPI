package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RMaijiaDianpufenbu;
import com.company.project.service.RMaijiaDianpufenbuService;
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
@RequestMapping("/r/maijia/dianpufenbu")
public class RMaijiaDianpufenbuController {
    @Resource
    private RMaijiaDianpufenbuService rMaijiaDianpufenbuService;

    @ApiIgnore
    @PostMapping("/add")
    public Result add(RMaijiaDianpufenbu rMaijiaDianpufenbu) {
        rMaijiaDianpufenbuService.save(rMaijiaDianpufenbu);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rMaijiaDianpufenbuService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/update")
    public Result update(RMaijiaDianpufenbu rMaijiaDianpufenbu) {
        rMaijiaDianpufenbuService.update(rMaijiaDianpufenbu);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RMaijiaDianpufenbu rMaijiaDianpufenbu = rMaijiaDianpufenbuService.findById(id);
        return ResultGenerator.genSuccessResult(rMaijiaDianpufenbu);
    }

    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RMaijiaDianpufenbu> list = rMaijiaDianpufenbuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value="获取卖家类型的比例", notes="根据后台categoryId和月份，获取该类目下的各个卖家店铺类型的数目")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query")
    })
    @GetMapping("/all/{categoryId}/categoryId/{month}/month")
    public Result getAllByCategoryId(@PathVariable Long categoryId,
                                     @PathVariable String month) {
        Condition condition =  new Condition(RMaijiaDianpufenbu.class);
        condition.createCriteria().andEqualTo("categoryid",categoryId).andEqualTo("month",month);
        List<RMaijiaDianpufenbu> list = rMaijiaDianpufenbuService.findByCondition(condition);
        return ResultGenerator.genSuccessResult(list);
    }


}
