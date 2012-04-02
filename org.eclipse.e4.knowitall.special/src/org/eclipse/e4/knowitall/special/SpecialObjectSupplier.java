package org.eclipse.e4.knowitall.special;

import org.eclipse.e4.core.di.suppliers.ExtendedObjectSupplier;
import org.eclipse.e4.core.di.suppliers.IObjectDescriptor;
import org.eclipse.e4.core.di.suppliers.IRequestor;

public class SpecialObjectSupplier extends ExtendedObjectSupplier{

	@Override
	public Object get(IObjectDescriptor descriptor, IRequestor requestor,
			boolean track, boolean group) {
		System.err.println(descriptor+" "+requestor);
//		System.err.println("SOS being called");
		return "Ky esh objekt rosh"
				;
	}

}
