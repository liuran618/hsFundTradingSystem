package com.hs.server.imp;

import com.hs.api.ProductService;
import com.hs.api.dto.ProductDTO;
import com.hs.server.dao.ProductMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@CloudComponent
public class ProductServiceImp implements ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImp.class);

    @Autowired
    private ProductMapper productMapper;

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
        return null;
    }

    @Override
    public Integer deleteProduct(Integer productId) {
        return null;
    }
}
