package feedexp.core;

import java.util.ArrayList;

public class ChannelTreeParent implements ChannelTree {
	private String name;
	private ChannelTreeParent parent;

	private ArrayList<ChannelTreeEntry> children;

	public ChannelTreeParent(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	}

	public void addChild(ChannelTreeEntry treeEntry) {
		children.add(treeEntry);
		treeEntry.setParent(this);
	}

	public void removeChild(ChannelTreeEntry child) {
		children.remove(child);
		child.setParent(null);
	}

	public ChannelTree[] getChildren() {
		return (ChannelTree[]) children.toArray(new ChannelTreeEntry[children.size()]);
	}

	public boolean hasChildren() {
		return children.size() > 0;
	}

	public void setParent(ChannelTreeParent parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public ChannelTreeParent getParent() {
		return this.parent;
	}

}
