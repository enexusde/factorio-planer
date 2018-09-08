package net.vectorpublish.desktop.vp;

import java.awt.event.ActionEvent;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import net.vectorpublish.desktop.vp.api.ui.ToolBar;
import net.vectorpublish.desktop.vp.api.ui.VPAbstractAction;
import net.vectorpublish.desktop.vp.ui.ImageKey;

@Named
public class AddBelt extends VPAbstractAction {

	@Inject
	private final ToolBar tb = null;

	public AddBelt() {
		super(Texts.ADD_BELT, Texts.ADD_BELT_TOOL_TIP, true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@PostConstruct
	public void setup() {
		setIcons(Texts.NS, ImageKey.get("add.belt"));
		tb.add(this);
	}
}
