package com.github.fatroom.springpathinjection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PathConfigTests {

    @Autowired
    private PathConfig pathConfig;

    @Test
    void contextLoads() {
        assertEquals("/tmp", pathConfig.getPath().toString());
    }
}
