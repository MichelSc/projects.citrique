package citrique2.calc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import citrique2.CitriqueObject;
import citrique2.ctr2Package;
import citrique2.impl.CitriqueDomainImpl;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueObjectCalcLongDescription extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(citriqueobject, ctr2Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapter parent = (PropagatorFunctionAdapter) Util.getAdapter(citriquedomain, CitriqueDomainImpl.LayerObjectDescription.class);
		return parent;
	}

	@Override
	protected void calculate() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		citriqueobject.refreshLongDescription();
	}

	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		if (  this.isFeatureChanged(msg, ctr2Package.eINSTANCE.getCitriqueObject_Description() )
		   || this.isFeatureChanged(msg, ctr2Package.eINSTANCE.getCitriqueObject_Child())) {
			this.touch();				
		}
	}
};
