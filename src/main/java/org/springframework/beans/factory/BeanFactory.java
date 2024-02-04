package org.springframework.beans.factory;

import java.util.HashMap;

/**
 * author:cjj
 * date:2024-02-04
 * 说明：最简单的Bean工厂类型，用一个map保存类的信息
 */
public class BeanFactory {
    private HashMap<String,Object> beanMap=new HashMap<>();

    public void registerBean(String name,Object bean){
        beanMap.put(name,bean);
    }
    public Object getBean(String beanName){
        return beanMap.get(beanName);
    }

}
