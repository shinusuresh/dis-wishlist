package com.sample.wishlist.api.generated;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultWishlistsResourceTest extends com.sample.wishlist.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /wishlists,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/wishlists";

	/* get() /wishlists */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /wishlists */
	@Test
	public void testPostWithWishlist()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final Wishlist entityBody =
		new Wishlist();
		final javax.ws.rs.client.Entity<Wishlist> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /wishlists/wishlistId */
	@Test
	public void testGetByWishlistId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/wishlistId");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /wishlists/wishlistId */
	@Test
	public void testPutByWishlistIdWithWishlist()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/wishlistId");
		final Wishlist entityBody =
		new Wishlist();
		final javax.ws.rs.client.Entity<Wishlist> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /wishlists/wishlistId */
	@Test
	public void testDeleteByWishlistId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/wishlistId");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}
	
	@Test
	public void testGetByWishlistIdWishlistItems()
	{
	    final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/wishlistId/wishlistItems");
	    final Response response = target.request().get();
	    Assert.assertNotNull("Response must not be null", response);
	    Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	@Test
	public void testPostByWishlistIdWishlistItemsWithWishlistItem()
	{
	    final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/wishlistId/wishlistItems");
	    final com.sample.wishlist.api.generated.WishlistItem entityBody =
	    new com.sample.wishlist.api.generated.WishlistItem();
	    final javax.ws.rs.client.Entity<com.sample.wishlist.api.generated.WishlistItem> entity =
	    javax.ws.rs.client.Entity.entity(entityBody,"application/json");
	    final Response response = target.request().post(entity);
	    Assert.assertNotNull("Response must not be null", response);
	    Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultWishlistsResource.class);
		return application;
	}
}
