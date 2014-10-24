package citrique3.calc;

import org.eclipse.emf.common.notify.Notifier;

import citrique3.CitriqueDomain;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapterParent;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueDomainLayerObjectChildren extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapterParent getParent() {
		Notifier target = this.target;
		CitriqueDomain domain= (CitriqueDomain)target;
		PropagatorFunctionAdapterParent parent = Util.getPropagatorFunctionAdapterParent(domain, CitriqueDomainScope.class);
		return parent;
	}
}
