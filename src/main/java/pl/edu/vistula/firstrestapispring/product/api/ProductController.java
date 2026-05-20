package pl.edu.vistula.firstrestapispring.product.api;

import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest request) {
        return service.create(request);
    }

    @GetMapping("/{id}")
    public ProductResponse findById(@PathVariable Long id) {
        return service.find(id);
    }

    @GetMapping
    public List<ProductResponse> findAll() {
        return service.findAll();
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


    @Operation(summary = "Find product by ID", description = "Returns a product by its unique identifier")
    @GetMapping("/api/v1/products/{id}")
    public ResponseEntity<ProductResponse> find(@PathVariable Long id) {
        ProductResponse response = service.find(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ProductResponse update(@PathVariable Long id, @RequestBody UpdateProductRequest request) {
        return service.update(id, request);
    }



}
