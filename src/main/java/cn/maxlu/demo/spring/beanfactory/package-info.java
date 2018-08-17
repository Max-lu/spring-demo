/**
 * beanfactory 和 applicationcontext 的区别
 * beanfactory 不会初始化singleton的bean
 * applicationcontext 会初始化singleton的bean
 *
 * 初始化条件 @see org.springframework.beans.factory.support.DefaultListableBeanFactory#preInstantiateSingletons()
 * if (!bd.isAbstract() && bd.isSingleton() && !bd.isLazyInit()) {
 *      ...
 * }
 */
package cn.maxlu.demo.spring.beanfactory;