package net.devstudy.tag.hometask;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public abstract class AbstractSwitchChildTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		SwitchTag sw = getSwitchTag();
		if (!sw.isProcess() && shouldBeProcessed(sw)) {
			sw.setProcess(true);
			getJspBody().invoke(null);
		}
	}
	
	protected abstract boolean shouldBeProcessed(SwitchTag sw);
	
	private SwitchTag getSwitchTag() throws JspException {
		JspTag tag = getParent();
		if (tag instanceof SwitchTag) {
			return (SwitchTag) tag;
		} else {
			throw new JspException("case tag should be inside switch tag! Current parent is: " + (tag != null ? tag.getClass() : null));
		}
	}
}
