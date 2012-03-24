package org.eclipse.e4.knowitall.service.finder;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.knowitall.service.simple.SimpleKnowItAll;
import org.eclipse.e4.knowitall.service.translator.TranslatorKnowItAll;

public class ServiceFinder implements IContextFunction {

	@Override
	public Object compute(IEclipseContext context) {
		String question = ((String) context.get("question")).toLowerCase();
//		System.err.println(question.indexOf("translate"));
//		System.err.println("Question is: "+question);
		if (question.indexOf("translate")>-1)
		return ContextInjectionFactory.make(TranslatorKnowItAll.class, context);
		else 
//			if (question.indexOf("show me the weather of"))
//			return 
		
		return ContextInjectionFactory.make(SimpleKnowItAll.class, context);
	}

}
