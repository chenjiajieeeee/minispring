package org.springframework.beans.factory.support;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
/**
 * Bean的实例化策略
 *
 * @author cjj
 * @date 2024/02/04
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
