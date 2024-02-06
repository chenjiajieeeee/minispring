package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

import java.util.HashMap;

/**
 * author:cjj
 * date:2024-02-04
 * 说明：最简单的Bean工厂类型，用一个map保存类的信息
 */
public interface BeanFactory {

    /**
     * 获取bean
     *
     * @param name
     * @return
     * @throws BeansException bean不存在时
     */
    Object getBean(String name) throws BeansException;

    /**
     * 根据名称和类型查找bean
     *
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}