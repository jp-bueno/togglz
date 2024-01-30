package br.com.togglz.service;

import br.com.togglz.dto.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class InventoryService {

    public List<Product> getAllProducts() {
        return Stream.of(new Product(1, "mobile", 50000),
                new Product(2, "headphone", 20000),
                new Product(3, "match", 14999),
                new Product(4, "glass", 999)
        ).collect(Collectors.toList());
    }
}
