package br.com.teste.jedisserialization.repositories;

public interface PessoaRedis {
	
	//SET
	
	public void setPessoaOnRedis(String idKey, Object json);

	public Object getPessoaFromRedis(String idKey);
}
