package net.devstudy.tag.hometask;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SwitchTag extends SimpleTagSupport {
	private Object value;
	private boolean process;
	@Override
	public void doTag() throws JspException, IOException {
		process = false;
		getJspBody().invoke(null);
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Object getValue() {
		return value;
	}
	public void setProcess(boolean process) {
		this.process = process;
	}
	public boolean isProcess() {
		return process;
	}
}
