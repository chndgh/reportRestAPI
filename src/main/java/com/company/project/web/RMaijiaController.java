package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RMaijia;
import com.company.project.service.RMaijiaDianpufenbuService;
import com.company.project.service.RMaijiaFugaiduService;
import com.company.project.service.RMaijiaService;
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
@RequestMapping("/r/maijia")
public class RMaijiaController {
    @Resource
    private RMaijiaService rMaijiaService;

    @ApiIgnore
    @PostMapping("/add")
    public Result add(RMaijia rMaijia) {
        rMaijiaService.save(rMaijia);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rMaijiaService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/update")
    public Result update(RMaijia rMaijia) {
        rMaijiaService.update(rMaijia);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RMaijia rMaijia = rMaijiaService.findById(id);
        return ResultGenerator.genSuccessResult(rMaijia);
    }
    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RMaijia> list = rMaijiaService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @ApiOperation(value="获取卖家画像数据", notes="根据后台categoryId,获取卖家画像数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "后台cateId", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "月份", required = true, dataType = "String", paramType = "query")
    })
    @GetMapping("/{categoryId}/categoryId/{month}/month")
    public Result getMaijiaByBackCategoryId(@PathVariable Long  categoryId,
                                            @PathVariable String month){
        Condition condition =  new Condition(RMaijia.class);
        condition.createCriteria().andEqualTo("categoryid",categoryId).andEqualTo("month",month);
        RMaijia maijia = rMaijiaService.findByCondition(condition).get(0);
        return  ResultGenerator.genSuccessResult(maijia);
    }
}
