package net.devstudy.tag.hometask;

import java.util.Objects;

public class CaseTag extends AbstractSwitchChildTag {
	private Object value;
	@Override
	protected boolean shouldBeProcessed(SwitchTag sw) {
		return Objects.equals(value, sw.getValue());
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
