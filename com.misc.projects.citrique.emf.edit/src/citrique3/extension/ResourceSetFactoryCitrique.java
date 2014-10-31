package citrique3.extension;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetFactory;

public class ResourceSetFactoryCitrique extends ResourceSetFactory {

	public ResourceSetFactoryCitrique() {
		
	}

	@Override
	public ResourceSet createResourceSet(URI resourceURI) {
		CommonPlugin.INSTANCE.log( "Create Editing Resource Set Citrique: uri="+resourceURI.toString());
		ResourceSet resourceSet = new ResourceSetImpl(){

			@Override
			public Resource createResource(URI uri, String contentType) {
				CommonPlugin.INSTANCE.log( "Create Resource: uri="+uri.toString()+", contenttype="+contentType);
				Resource resource = super.createResource(uri, contentType);
				return resource;
			}
			
		};
		return resourceSet;
	}

}
