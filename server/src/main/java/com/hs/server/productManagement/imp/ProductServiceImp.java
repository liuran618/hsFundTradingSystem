package com.hs.server.productManagement.imp;

import com.hs.api.productManagement.ProductService;
import com.hs.api.productManagement.dto.ProdailyDTO;
import com.hs.api.productManagement.dto.ProductDTO;
import com.hs.server.productManagement.dao.ProdailyMapper;
import com.hs.server.productManagement.dao.ProductMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@CloudComponent
public class ProductServiceImp implements ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImp.class);

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProdailyMapper prodailyMapper;

    @Override
    public Integer addProduct(ProductDTO product) {
            productMapper.addProduct(product);
            logger.info("添加产品成功，产品名称{}：", product.getProductName());
            return 1;
    }

    @Override
    public ProductDTO getProduct(Integer productId) {
        return productMapper.getProduct(productId);
    }

    @Override
    public Integer updateProduct(ProductDTO productDTO) {
        int judge = productMapper.updateProduct(productDTO);
        return judge;
    }

    @Override
    public Integer deleteProduct(Integer productId) {
        int judge = productMapper.deleteProduct(productId);
        return judge;
    }

    @Override
    public ProdailyDTO getProdaily(Integer proDailyId) {
        return prodailyMapper.getProdaily(proDailyId);
    }
}
