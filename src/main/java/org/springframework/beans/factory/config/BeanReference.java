package org.springframework.beans.factory.config;

/**
 * @author Tina
 * @date 2024-02-04
 * 实现了一个bean引用另一个bean的实例化，但是没有解决循环依赖的问题。
 */
public class BeanReference {
    private final String beanName;


    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
