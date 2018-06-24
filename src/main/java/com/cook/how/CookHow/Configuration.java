package com.cook.how.CookHow;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean(name = "org.dozer.DozerBeanMapper")
    @Scope(value = "singleton")
    public DozerBeanMapper dozerBean() {
        /*List<String> mappingFiles = Arrays.asList(
                "dozer-global-configuration.xml",
                "dozer-bean-mappings.xml",
                "more-dozer-bean-mappings.xml"
        );*/

        return new DozerBeanMapper();
        //dozerBean.setMappingFiles(mappingFiles);
    }

}
