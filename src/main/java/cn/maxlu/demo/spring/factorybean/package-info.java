/**
 * BeanFactory.getBean()中获取的实际上是FactoryBean的getObject()返回的对象，而不是FactoryBean本身，
 * 如果要获取FactoryBean对象，请在id前面加一个&符号来获取。
 * @see org.springframework.beans.factory.support.AbstractBeanFactory#getObjectForBeanInstance(java.lang.Object, java.lang.String, java.lang.String, org.springframework.beans.factory.support.RootBeanDefinition)
 * @see org.springframework.beans.factory.support.FactoryBeanRegistrySupport#doGetObjectFromFactoryBean(org.springframework.beans.factory.FactoryBean, java.lang.String)
 */
package cn.maxlu.demo.spring.factorybean;