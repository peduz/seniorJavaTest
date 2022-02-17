package it.redevTech.seniorJavaTest.rest.response;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

	private static final long serialVersionUID = -5941442517587228369L;

	private int code;
	
	private String message;
	
	private T payload;
	
	public BaseResponse() { }

	public BaseResponse(int code, String message, T payload) {
		super();
		this.code = code;
		this.message = message;
		this.payload = payload;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "BaseResponse [code=" + code + ", message=" + message + ", payload=" + payload + "]";
	}
	
}
