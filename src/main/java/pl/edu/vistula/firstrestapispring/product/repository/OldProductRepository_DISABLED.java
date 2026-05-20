package pl.edu.vistula.firstrestapispring.product.repository;

import org.springframework.stereotype.Repository;
import pl.edu.vistula.firstrestapispring.product.domain.Product;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


@Repository
public class OldProductRepository_DISABLED {

    protected final Map<Long, Product> map = new HashMap<>();
    protected long counter = 1;

    public Product save(Product entity) {
        setId(entity);
        return entity;
    }

    private Product setId(Product entity) {
        if (entity.getId() == null) {
            entity.setId(counter);
            counter++;
        }
        map.put(entity.getId(), entity);
        return entity;
    }


    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }

    public void deleteById(Long id) {
        map.remove(id);
    }


}
