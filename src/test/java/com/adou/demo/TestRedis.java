package com.adou.demo;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import com.adou.demo.domain.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
	 
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    
	@Autowired
	private RedisTemplate redisTemplate;
 
    @Test
    public void test() throws Exception {
    	System.out.println("====================== set ");
        stringRedisTemplate.opsForValue().set("aaa", "111");
        
        System.out.println("====================== " + "111".equals(stringRedisTemplate.opsForValue().get("aaa")));
        
    }
    
//    @Test
    public void testObj() throws Exception {
        User user=new User("aa@126.com", "aa", 21, "aa123456", "aa","123");
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        operations.set("user-key", user);
        operations.set("com.neo.f", user,10,TimeUnit.SECONDS);
        Thread.sleep(1000);
        boolean exists=redisTemplate.hasKey("com.neo.f");
        if(exists){
        	System.out.println("exists is true");
        }else{
        	System.out.println("exists is false");
        }
        System.out.println("------------------ " + operations.get("user-key"));
    }
}
