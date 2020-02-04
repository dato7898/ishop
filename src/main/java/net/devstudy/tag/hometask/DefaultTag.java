package net.devstudy.tag.hometask;

public class DefaultTag extends AbstractSwitchChildTag {
	@Override
	protected boolean shouldBeProcessed(SwitchTag sw) {
		return true;
	}
}
