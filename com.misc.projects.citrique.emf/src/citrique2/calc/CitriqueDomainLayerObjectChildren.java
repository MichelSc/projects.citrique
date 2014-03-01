package citrique2.calc;

import org.eclipse.emf.common.notify.Notifier;

import citrique2.CitriqueDomain;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueDomainLayerObjectChildren extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Notifier target = this.target;
		CitriqueDomain domain= (CitriqueDomain)target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(domain, CitriqueDomainScope.class);
		return parent;
	}
}
