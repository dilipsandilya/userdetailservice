package com.ecommerce.user.userdetailservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ValidateDBConnectionTest {
    @Autowired
    private DataSource dataSource;

    @Test
    void dbConnectionTest() throws SQLException {
        assertTrue(dataSource.getConnection().isValid(10));
        //TODO: need to verify this
        //assertEquals( "ecommerce_userdb",dataSource.getConnection().getSchema());
    }
}
