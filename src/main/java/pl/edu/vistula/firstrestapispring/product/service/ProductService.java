package pl.edu.vistula.firstrestapispring.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.domain.Product;
import pl.edu.vistula.firstrestapispring.product.repository.ProductRepository;
import pl.edu.vistula.firstrestapispring.product.support.ProductMapper;
import pl.edu.vistula.firstrestapispring.product.support.ProductExceptionSupplier;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;
    private final ProductExceptionSupplier exceptionSupplier;

    public ProductService(ProductRepository repository,
                          ProductMapper mapper,
                          ProductExceptionSupplier exceptionSupplier) {
        this.repository = repository;
        this.mapper = mapper;
        this.exceptionSupplier = exceptionSupplier;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toProduct(request);
        Product saved = repository.save(product);
        return mapper.toProductResponse(saved);
    }

    public ProductResponse find(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(exceptionSupplier.productNotFound(id));
        return mapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toProductResponse)
                .toList();
    }

    public void delete(Long id) {
        Product existing = repository.findById(id)
                .orElseThrow(exceptionSupplier.productNotFound(id));
        repository.deleteById(id);
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {
        Product existing = repository.findById(id)
                .orElseThrow(exceptionSupplier.productNotFound(id));
        Product updated = mapper.toProduct(existing, request);
        Product saved = repository.save(updated);
        return mapper.toProductResponse(saved);
    }
}

