package citrique2.calc;


import org.eclipse.emf.common.notify.Notifier;

import citrique2.CitriqueDomain;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueDomainLayerObjectDescription extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Notifier target = this.target;
		CitriqueDomain domain= (CitriqueDomain)target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(domain, CitriqueDomainScope.class);
		return parent;
	}
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Notifier target = this.target;
		CitriqueDomain domain= (CitriqueDomain)target;
		PropagatorFunctionAdapter layerchildren = Util.getPropagatorFunctionAdapter(domain, CitriqueDomainLayerObjectChildren.class);
		
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		antecedents.add(layerchildren);
		return antecedents;
	}
}
