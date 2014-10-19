package citrique2.calc;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import citrique2.CitriqueObject;
import citrique2.ctr2Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueObjectInit extends PropagatorFunctionAdapter {
	@Override
	protected PropagatorFunctionAdapter getParent() {
		CitriqueObject target = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(target, ctr2Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(citriquedomain, CitriqueDomainLayerObjectInit.class);
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
