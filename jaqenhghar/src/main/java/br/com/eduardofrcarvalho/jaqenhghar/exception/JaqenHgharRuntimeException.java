package br.com.eduardofrcarvalho.jaqenhghar.exception;

import lombok.Getter;

public class JaqenHgharRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	@Getter
	private String code;
	
	@Getter
	private String[] parameters;
	
	public JaqenHgharRuntimeException(String pCode, String... pParameters) {
		this(null, pCode, pParameters);
	}

	public JaqenHgharRuntimeException(Throwable pThrowable, String pCode, String... pParameters) {
		super(pThrowable);
		this.code = pCode;
		this.parameters = pParameters;
	}
}
