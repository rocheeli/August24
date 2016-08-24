package com.assignmentfive.adapter;

import com.jamcracker.jif.adapter.Authentication;
import com.jamcracker.jif.dataobject.AuthInfo;
import com.jamcracker.jif.exception.AuthenticationException;

public class AuthenticationImpl implements Authentication {

	public void authenticate(AuthInfo authInfo) throws AuthenticationException {
		String authLogin = authInfo.getUserName();
		String authPassword = authInfo.getPassword();
		//If the auth info is not valid throw exception
		
		//throw new AuthenticationException(1000,"Authorization failed");
	}

}
