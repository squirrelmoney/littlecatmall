package com.littlecat.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: money
 * @time: 2020/7/7 1:16
 */
public class ListConstraintValidator  implements ConstraintValidator<ListValue,Integer> {

    private Set<Integer> set=new HashSet<>();

    //初始化方法
    //此方法保证在使用此实例之前被调用

    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        for (int val:vals){
            set.add(val);
        }
    }

    /**
     *  @param value 需要校验的值
     *  @param context 需要校验的值
     * @return
     */
    //判断是否校验成功
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return set.contains(value);
    }
}
