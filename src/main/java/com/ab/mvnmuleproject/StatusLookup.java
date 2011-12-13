package com.ab.mvnmuleproject;

import java.lang.String;

public class StatusLookup {

	public String checkStatus(Msg message) {
		if (message.count == null || (message.count % 2 != 0) ) {
			return "BAD";
		} else {
			return "GOOD";
		}
	}
}
