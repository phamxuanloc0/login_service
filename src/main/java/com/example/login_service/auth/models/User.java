package com.example.login_service.auth.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408418647685225829L;
	private String uid;
	private String name;
	private String phone;//Email
	private boolean isPhoneVerified;//Phone
	private String issuer;
	private String picture;

}
