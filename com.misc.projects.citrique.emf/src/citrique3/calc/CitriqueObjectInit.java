package citrique3.calc;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import citrique3.CitriqueObject;
import citrique3.Citrique3Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapterParent;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueObjectInit extends PropagatorFunctionAdapter {
	@Override
	protected PropagatorFunctionAdapterParent getParent() {
		CitriqueObject target = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(target, Citrique3Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapterParent parent = Util.getPropagatorFunctionAdapterParent(citriquedomain, CitriqueDomainLayerObjectInit.class);
		return parent;
	}

	@Override
	protected void calculate() {
		CitriqueObject target = (CitriqueObject)this.getTarget();
		target.init();
	}
	
	

	@Override
	protected boolean isTouchOnOwned() {
		// does the same as super, this is just to make it explicit
		return true;
	}

	@Override
	public void onContained(Notifier newcontainer) {
		super.onContained(newcontainer);
		this.touch();
	}
	
}
