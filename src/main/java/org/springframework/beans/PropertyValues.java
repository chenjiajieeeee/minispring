package org.springframework.beans;


import java.util.ArrayList;
import java.util.List;

/**
 * BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、bean属性、bean的scope等，此处简化只包含class类型和bean属性
 *
 * @author Tina
 * @date 2024/02/04
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue currentPv = this.propertyValueList.get(i);
            if (currentPv.getName().equals(pv.getName())) {
                //覆盖原有的属性值
                this.propertyValueList.set(i, pv);
                return;
            }
        }
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue pv = this.propertyValueList.get(i);
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
