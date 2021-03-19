package com.github.fatroom.springpathinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Path;

@Configuration
public class PathConfig {
    private final Path path;

    public PathConfig(@Value("/tmp") Path path) {
        this.path = path;
    }

    public Path getPath() {
        return path;
    }
}
