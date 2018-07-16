package org.parseerror;


import javax.inject.Named;


@Named
public class FormFeeder {

	public String getFormFeed() {
		return "\f";
	}
}