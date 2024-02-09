package org.springframework.beans.factory.config;



/**
 * 单例注册表
 *
 * @author tina
 * @date 2024/02/04
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}