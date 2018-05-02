package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RProduct;
import com.company.project.service.RProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/04/29.
*/
@RestController
@RequestMapping("/r/product")
public class RProductController {
    @Resource
    private RProductService rProductService;
    @ApiIgnore
    @PostMapping("/add")
    public Result add(RProduct rProduct) {
        rProductService.save(rProduct);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rProductService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/update")
    public Result update(RProduct rProduct) {
        rProductService.update(rProduct);
        return ResultGenerator.genSuccessResult();
    }
    @ApiIgnore
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RProduct rProduct = rProductService.findById(id);
        return ResultGenerator.genSuccessResult(rProduct);
    }
    @ApiIgnore
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RProduct> list = rProductService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
