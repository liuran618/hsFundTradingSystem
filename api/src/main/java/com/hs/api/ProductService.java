package com.hs.api;

import com.hs.api.dto.ProductDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService(validation = true)

public interface ProductService {
    Integer addProduct(ProductDTO productDTO);

    ProductDTO getProduct(Integer productId);

    Integer updateProduct(ProductDTO productDTO);

    Integer deleteProduct(Integer productId);

}
