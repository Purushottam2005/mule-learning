package com.ab.mvnmuleproject;

import java.lang.String;
import java.lang.Integer;
import org.codehaus.jackson.annotate.JsonAutoDetect;

public class MsgService {

	public MsgService() {
	}

	public Msg processMsg(Msg message) {
		message.count = message.count+1;
		return message;
	}
}

