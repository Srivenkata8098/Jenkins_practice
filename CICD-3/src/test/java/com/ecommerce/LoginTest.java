package com.ecommerce;

import com.ecommerce.model.User;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest {

    @Test
    void loginValid() {
        User u = new User();
        u.setUsername("admin");
        u.setPassword("password");
        assertThat("admin").isEqualTo(u.getUsername());
        assertThat("password").isEqualTo(u.getPassword());
    }
}
