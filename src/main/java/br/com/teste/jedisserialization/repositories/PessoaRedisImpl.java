package br.com.teste.jedisserialization.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PessoaRedisImpl implements PessoaRedis {
	
	@Autowired
	RedisTemplate<String, Object> redisTemplate;

	@Override
	public void setPessoaOnRedis(String idKey, Object json) {
		redisTemplate.opsForValue().set(idKey, json);
		
	}

	@Override
	public Object getPessoaFromRedis(String idKey) {
		return redisTemplate.opsForValue().get(idKey);
	}

}
