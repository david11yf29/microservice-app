package com.microservice.service;

import com.microservice.dto.ProductRequest;
import com.microservice.dto.ProductResponse;
import com.microservice.model.Product;
import com.microservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        // Map ProductRequest to Product in order to save into the mongodb
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        // db received Product and need to map into ProductResponse
        List<Product> products = productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
//        products.stream().map(product -> mapToProductResponse(product));
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
