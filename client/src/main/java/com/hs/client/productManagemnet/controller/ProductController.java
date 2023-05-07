package com.hs.client.productManagemnet.controller;

import com.hs.api.productManagement.ProductService;
import com.hs.api.productManagement.dto.ProductDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @CloudReference
    private ProductService productService;

    @RequestMapping("/addProduct")
    public String addProduct(){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName("ABC Product");
        productDTO.setProductType("Type A");
        productDTO.setProductInfo("A is ok");
        productDTO.setProductManager("小王");
        int i = productService.addProduct(productDTO);
        return "产品 " + productDTO.getProductName() + " 添加成功！" + i;
    }

    @RequestMapping("/getProduct")
    public ProductDTO getProduct(){
        return productService.getProduct(1);
    }

}
