package com.jbk.product.exception;

public class ProductAlreadyExistsException extends RuntimeException{
	
	public ProductAlreadyExistsException(String msg) {
		super(msg);
	}

}
