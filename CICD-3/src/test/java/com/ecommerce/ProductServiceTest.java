package com.ecommerce;

import com.ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

public class ProductServiceTest {

    @Test
    void productsShouldBeReturned() {
        ProductService svc = new ProductService();
        List<?> list = svc.getProducts();
        assertThat(list).isNotEmpty();
        assertThat(list.size()).isGreaterThanOrEqualTo(3);
    }
}
