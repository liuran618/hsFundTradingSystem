package com.hs.client.productManagemnet.controller;

import com.hs.api.productManagement.ProductService;
import com.hs.api.productManagement.dto.ProdailyDTO;
import com.hs.api.productManagement.dto.ProductDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hs.common.Result;
@RestController
@RequestMapping("/product")
public class ProductController {
    @CloudReference
    private ProductService productService;

    @RequestMapping("/addProduct")
    public Result<?> addProduct(@RequestBody ProductDTO productDTO){
        int judge = productService.addProduct(productDTO);
        return Result.success();
    }

    @RequestMapping("/getProduct/{id}")
    public Result<?> getProduct(@PathVariable("id") Integer id){
        ProductDTO productDTO = productService.getProduct(id);
        return Result.success(productDTO);
    }

    @RequestMapping("/updateProduct")
    public Result<?> updateProduct(@RequestBody ProductDTO productDTO){;
        productService.updateProduct(productDTO);
        return Result.success();
    }

    @RequestMapping("/deleteProduct/{id}")
    public Result<?> deleteProduct(@PathVariable("id") Integer id){
        int judge = productService.deleteProduct(id);
        return Result.success();
    }

    @RequestMapping("/getProdaily/{id}")
    public Result<?> getProDaily(@PathVariable("id") Integer id){
        ProdailyDTO prodailyDTO =productService.getProdaily(id);
        return Result.success(prodailyDTO);
    }
}
