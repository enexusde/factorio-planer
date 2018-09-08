package net.vectorpublish.desktop.vp;

import net.vectorpublish.desktop.vp.i8n.I8nText;
import net.vectorpublish.desktop.vp.ui.Namespace;

public enum Texts implements I8nText {
	ADD_BELT, ADD_BELT_TOOL_TIP;

	public final static Namespace NS = Namespace.getNamespace("de.e-nexus", "factorio-planer");

	@Override
	public Namespace getNamespace() {
		return NS;
	}

}
