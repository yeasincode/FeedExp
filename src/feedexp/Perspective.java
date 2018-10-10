package feedexp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import feedexp.views.ChannelsTreeView;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		String editorArea=layout.getEditorArea();
		layout.addStandaloneView(ChannelsTreeView.ID, true, IPageLayout.LEFT, 0.25f, editorArea);
	}
}
