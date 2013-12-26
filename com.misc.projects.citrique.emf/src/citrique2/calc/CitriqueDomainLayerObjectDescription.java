package citrique2.calc;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;

import citrique2.CitriqueDomain;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueDomainLayerObjectDescription extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Notifier target = this.target;
		CitriqueDomain domain= (CitriqueDomain)target;
		PropagatorFunctionAdapter parent = (PropagatorFunctionAdapter)Util.getAdapter(domain, CitriqueDomainScope.class);
		return parent;
	}
	@Override
	protected List<PropagatorFunctionAdapter> getAntecedents() {
		Notifier target = this.target;
		CitriqueDomain domain= (CitriqueDomain)target;
		PropagatorFunctionAdapter layerchildren = (PropagatorFunctionAdapter)Util.getAdapter(domain, CitriqueDomainLayerObjectChildren.class);
		
		ArrayList<PropagatorFunctionAdapter> antecedents = new ArrayList<PropagatorFunctionAdapter>();
		antecedents.add(layerchildren);
		return antecedents;
	}
}
