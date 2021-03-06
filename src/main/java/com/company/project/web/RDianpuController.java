package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RDianpu;
import com.company.project.service.RDianpuService;
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
@RequestMapping("/r/dianpu")
public class RDianpuController {
    @Resource
    private RDianpuService rDianpuService;
    @ApiIgnore
    @PostMapping("/add")
    public Result add(RDianpu rDianpu) {
        rDianpuService.save(rDianpu);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rDianpuService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/update")
    public Result update(RDianpu rDianpu) {
        rDianpuService.update(rDianpu);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RDianpu rDianpu = rDianpuService.findById(id);
        return ResultGenerator.genSuccessResult(rDianpu);
    }
    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RDianpu> list = rDianpuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value="获取店铺分析数据", notes="根据后台categoryId, 获取店铺分析数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "shoptype", value = "类型", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    @GetMapping("/{categoryId}/categoryId/{month}/month/{shoptype}/shoptype")
    public Result getDianpuByBackCategoryId(@PathVariable Long  categoryId,
                                            @PathVariable String month,
                                            @PathVariable Long shoptype,
                                            @RequestParam(defaultValue = "0") Integer page,
                                            @RequestParam(defaultValue = "0") Integer size){
        Condition condition =  new Condition(RDianpu.class);
        condition.createCriteria().andEqualTo("categoryid",categoryId)
                                  .andEqualTo("month",month)
                                  .andEqualTo("shoptype",shoptype);
        PageHelper.startPage(page, size);
        List<RDianpu> dianpus = rDianpuService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(dianpus);
        return  ResultGenerator.genSuccessResult(pageInfo);
    }
}

