package com.demo.travel.global.config.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Configuration
@EnableJpaRepositories
public class JpaConfig {

    // @Bean
    // LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    //     LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    //     return em;
    // }

    // @Bean
    // PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
    //     return new JpaTransactionManager(entityManagerFactory);
    // }

    /*
     * querydsl을 사용하기 위한 설정
     */
    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    JPAQueryFactory jpaQueryFactory(){
        return new JPAQueryFactory(entityManager);
    }

}
