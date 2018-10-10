package feedexp.core;

public interface ChannelTree {
	public String getName();
	public ChannelTreeParent getParent();
	public abstract void setParent(ChannelTreeParent parent);
}
