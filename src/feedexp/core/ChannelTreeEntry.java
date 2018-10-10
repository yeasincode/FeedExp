package feedexp.core;

public class ChannelTreeEntry implements ChannelTree {
	
	private String name;
	private ChannelTreeParent parent;
	
	public ChannelTreeEntry(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public ChannelTreeParent getParent() {
		return parent;
	}

	@Override
	public void setParent(ChannelTreeParent parent) {
		this.parent=parent;
	}

}
