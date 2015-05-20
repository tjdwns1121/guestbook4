package com.sds.icto.guestbook.exception;

public class UserInsertException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UserInsertException() {
		super( "Create User Exception" );
	}
	
	public UserInsertException( String msg ) {
		super( msg );
	}
}
