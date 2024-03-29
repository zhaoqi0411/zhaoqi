package com.temp.spring.ioc;

import org.springframework.beans.factory.InitializingBean;

/**
 * 2 * @Author: zhaoqi
 * 3 * @Date: 2019/8/6 0006 AM 9:57
 * 4
 */
public class BeanTest implements InitializingBean{

    public BeanTest() {
        System.out.println("bean构造成功....................");
    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init 方法");
    }
}
