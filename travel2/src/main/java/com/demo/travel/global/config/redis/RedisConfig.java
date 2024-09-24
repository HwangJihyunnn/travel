package com.demo.travel.global.config.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);

        // TODO 추후 Redis 를 사용할때 직렬화 방식 설정
        // Redis에서 키를 문자열로 직렬화 (필요에 따라 다르게 설정 가능)
        template.setKeySerializer(new StringRedisSerializer());

        // 해시 키를 문자열로 직렬화
        template.setHashKeySerializer(new StringRedisSerializer());

        // 해시 값을 JSON으로 직렬화 (필요에 따라 다르게 설정 가능)
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

        return template;
    }
}
