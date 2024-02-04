package org.springframework.beans.core.io;

public interface ResourceLoader {
    Resource getResource(String location);
}
