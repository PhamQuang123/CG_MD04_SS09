package cg.codegym.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{HibernateJPAConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("utf-8", true);
        return new Filter[]{filter};
    }
}
// https://mvnrepository.com/artifact/mysql/mysql-connector-java
//    implementation 'mysql:mysql-connector-java:8.0.33'
// https://mvnrepository.com/artifact/javax.servlet/jstl
//            implementation 'javax.servlet:jstl:1.2'
//
// https://mvnrepository.com/artifact/org.springframework/spring-webmvc
//            implementation group: 'org.springframework', name: 'spring-webmvc', version: '5.3.23'
//            // https://mvnrepository.com/artifact/org.hibernate/hibernate-core
//            implementation group: 'org.hibernate', name: 'hibernate-core', version: '5.3.28.Final'
//            // https://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager
//            implementation group: 'org.hibernate', name: 'hibernate-entitymanager', version: '5.3.28.Final'
//            // https://mvnrepository.com/artifact/org.springframework/spring-orm
//            implementation group: 'org.springframework', name: 'spring-orm', version: '5.3.23'
//            // https://mvnrepository.com/artifact/org.projectlombok/lombok
//            compileOnly 'org.projectlombok:lombok:1.18.24'
//            annotationProcessor 'org.projectlombok:lombok:1.18.24'
//            implementation group: 'org.springframework.data', name: 'spring-data-jpa', version: '2.4.2'
//
//            // https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload
//            implementation group: 'commons-fileupload', name: 'commons-fileupload', version: '1.5'