package com.ab.mvnmuleproject;

import java.lang.String;
import java.lang.Integer;
import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class Msg {

	public String message;
	public Integer count;

	public Msg() {
	}
}
