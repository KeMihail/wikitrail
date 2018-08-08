package de.hybris.training.core.additions;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.training.core.constants.GeneratedTrainingCoreConstants.Attributes.Customer;
import de.hybris.training.core.constants.GeneratedTrainingCoreConstants.Attributes.Product;

import org.junit.Assert;
import org.junit.Test;



@UnitTest
public class GeneratedTypesTest
{
	@Test
	public void testAttribute()
	{
		Assert.assertTrue(ProductModel.INTERNALONLY.equals(Product.INTERNALONLY));
		Assert.assertTrue(CustomerModel.ISINTERNAL.equals(Customer.ISINTERNAL));
	}

}
