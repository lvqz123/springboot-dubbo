package com.lvqz.dubbo.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * @author: lvqz
 * @date: 2019/10/23
 * @time: 14:25
 */
@Component
public class SpringUtils implements ApplicationContext {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public String getId() {
        return null;
    }

    public String getApplicationName() {
        return null;
    }

    public String getDisplayName() {
        return null;
    }

    public long getStartupDate() {
        return 0;
    }

    public ApplicationContext getParent() {
        return null;
    }

    public AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException {
        return null;
    }

    public BeanFactory getParentBeanFactory() {
        return null;
    }

    public boolean containsLocalBean(String s) {
        return false;
    }

    public boolean containsBeanDefinition(String s) {
        return false;
    }

    public int getBeanDefinitionCount() {
        return 0;
    }

    public String[] getBeanDefinitionNames() {
        return applicationContext.getBeanDefinitionNames();
    }

    public String[] getBeanNamesForType(ResolvableType resolvableType) {
        return new String[0];
    }

    public String[] getBeanNamesForType(Class<?> aClass) {
        return new String[0];
    }

    public String[] getBeanNamesForType(Class<?> aClass, boolean b, boolean b1) {
        return new String[0];
    }

    public <T> Map<String, T> getBeansOfType(Class<T> aClass) throws BeansException {
        return null;
    }

    public <T> Map<String, T> getBeansOfType(Class<T> aClass, boolean b, boolean b1) throws BeansException {
        return null;
    }

    public String[] getBeanNamesForAnnotation(Class<? extends Annotation> aClass) {
        return new String[0];
    }

    public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> aClass) throws BeansException {
        return null;
    }

    public <A extends Annotation> A findAnnotationOnBean(String s, Class<A> aClass) throws NoSuchBeanDefinitionException {
        return null;
    }

    public Object getBean(String s) throws BeansException {
        return null;
    }

    public <T> T getBean(String s, Class<T> aClass) throws BeansException {
        return null;
    }

    public Object getBean(String s, Object... objects) throws BeansException {
        return null;
    }

    public <T> T getBean(Class<T> aClass) throws BeansException {
        return null;
    }

    public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {
        return null;
    }

    public <T> ObjectProvider<T> getBeanProvider(Class<T> aClass) {
        return null;
    }

    public <T> ObjectProvider<T> getBeanProvider(ResolvableType resolvableType) {
        return null;
    }

    public boolean containsBean(String s) {
        return false;
    }

    public boolean isSingleton(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    public boolean isPrototype(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    public boolean isTypeMatch(String s, ResolvableType resolvableType) throws NoSuchBeanDefinitionException {
        return false;
    }

    public boolean isTypeMatch(String s, Class<?> aClass) throws NoSuchBeanDefinitionException {
        return false;
    }

    public Class<?> getType(String s) throws NoSuchBeanDefinitionException {
        return null;
    }

    public String[] getAliases(String s) {
        return new String[0];
    }

    public void publishEvent(Object o) {

    }

    public String getMessage(String s, Object[] objects, String s1, Locale locale) {
        return null;
    }

    public String getMessage(String s, Object[] objects, Locale locale) throws NoSuchMessageException {
        return null;
    }

    public String getMessage(MessageSourceResolvable messageSourceResolvable, Locale locale) throws NoSuchMessageException {
        return null;
    }

    public Environment getEnvironment() {
        return null;
    }

    public Resource[] getResources(String s) throws IOException {
        return new Resource[0];
    }

    public Resource getResource(String s) {
        return null;
    }

    public ClassLoader getClassLoader() {
        return null;
    }
}
