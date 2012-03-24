package org.eclipse.e4.knowitall.service.finder;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.knowitall.service.simple.SimpleKnowItAll;

public class ServiceFinder implements IContextFunction {

	@Override
	public Object compute(IEclipseContext context) {
		return ContextInjectionFactory.make(SimpleKnowItAll.class, context);
	}

}
