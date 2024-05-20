package com.spring.bean.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonDemo")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) //if we write this line or not the scope of this class will be singleton 
//if we dont define any scope then the default scope for the class is singleton
public class SingletonDemo {

}
