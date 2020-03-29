package com.kerry.creator.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.stereotype.Component;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/29
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class MyNameGenerator implements BeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String beanClassName = Introspector.decapitalize(definition.getBeanClassName());
        String beanName = getBeanName(beanClassName);
        log.info("init bean：{}", beanName);
        return beanName;
    }

    private String getBeanName(String beanClassName) {
        String separator = ".";
        String[] splits = StringUtils.split(beanClassName, separator);
        return Arrays.asList(splits).get(splits.length-1);
    }
}
