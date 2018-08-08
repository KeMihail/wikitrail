package de.hybris.training.core.model;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;


public class CustomerDynamicAttributeHandler extends AbstractDynamicAttributeHandler<Boolean, CustomerModel>
{

	@Override
	public Boolean get(final CustomerModel model)
	{

		if (model == null)
		{
			throw new IllegalArgumentException("Item model is required");
		}
		return Boolean
				.valueOf(model.getUid() != null && (model.getUid().endsWith("hybris.com") || model.getUid().endsWith("hybris.de")));
	}

}
