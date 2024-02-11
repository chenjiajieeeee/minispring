package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * @author tina
 * @date 2024-02-04
 */
public class SimpleBeanContainerTest {
    @Test
    public void testGetBean(){


    }
     class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
