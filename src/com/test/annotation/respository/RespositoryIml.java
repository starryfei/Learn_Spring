package com.test.annotation.respository;

import org.springframework.stereotype.Repository;

@Repository(value="respository")
public class RespositoryIml implements Respository {

	@Override
	public void save() {
		// TODO Auto-generated method stub
        System.out.println("Respository save...");     
	}

}
