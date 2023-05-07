package com.hs.api.productManagement;

import com.hs.api.productManagement.dto.ProductDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService(validation = true)

public interface ProductService {
    Integer addProduct(ProductDTO productDTO);

    ProductDTO getProduct(Integer productId);

    Integer updateProduct(ProductDTO productDTO);

    Integer deleteProduct(Integer productId);

}
