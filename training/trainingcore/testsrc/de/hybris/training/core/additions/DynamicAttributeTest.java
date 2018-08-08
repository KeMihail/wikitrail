package de.hybris.training.core.additions;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;


@IntegrationTest
public class DynamicAttributeTest extends ServicelayerTransactionalTest
{
	@Resource
	private ModelService modelService;

	@Test
	public void testDynamicAttribute()
	{
		final CustomerModel customer = modelService.create(CustomerModel.class);
		customer.setUid("hybris.com");

		Assert.assertEquals(Boolean.TRUE, customer.getIsInternal());

		customer.setUid("hybris.de");
		Assert.assertEquals(Boolean.TRUE, customer.getIsInternal());

		customer.setUid("yandex.ru");
		Assert.assertEquals(Boolean.FALSE, customer.getIsInternal());
	}
}
