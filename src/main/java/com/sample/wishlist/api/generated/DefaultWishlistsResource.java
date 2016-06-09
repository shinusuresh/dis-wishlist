
package com.sample.wishlist.api.generated;

import javax.inject.Singleton;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

/**
 * Resource class containing the custom logic. Please put your logic here!
 */
@Component("apiWishlistsResource")
@Singleton
public class DefaultWishlistsResource implements com.sample.wishlist.api.generated.WishlistsResource {
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	/* GET / */
	@Override
	public void get(@Suspended final AsyncResponse asyncResponse, final PagedParameters paged,
			final YaasAwareParameters yaasAware) {
		// please provide some async response logic here
		// you may run time consuming logic in the separate thread, but still
		// remember to resume processing of the http request at the end of the
		// separate thread flow
		// for more details refer to
		// https://jersey.java.net/documentation/latest/async.html or SDK
		// documentation

		asyncResponse.resume(Response.ok().entity(new java.util.ArrayList<Wishlist>()).build());
	}

	/* POST / */
	@Override
	public void post(@Suspended final AsyncResponse asyncResponse, final YaasAwareParameters yaasAware,
			final Wishlist wishlist) {
		// please provide some async response logic here
		// you may run time consuming logic in the separate thread, but still
		// remember to resume processing of the http request at the end of the
		// separate thread flow
		// for more details refer to
		// https://jersey.java.net/documentation/latest/async.html or SDK
		// documentation

		asyncResponse.resume(Response.created(uriInfo.getAbsolutePath()).build());
	}

	/* GET /{wishlistId} */
	@Override
	public void getByWishlistId(@Suspended final AsyncResponse asyncResponse, final YaasAwareParameters yaasAware,
			final java.lang.String wishlistId) {
		// please provide some async response logic here
		// you may run time consuming logic in the separate thread, but still
		// remember to resume processing of the http request at the end of the
		// separate thread flow
		// for more details refer to
		// https://jersey.java.net/documentation/latest/async.html or SDK
		// documentation

		asyncResponse.resume(Response.ok().entity(new Wishlist()).build());
	}

	/* PUT /{wishlistId} */
	@Override
	public void putByWishlistId(@Suspended final AsyncResponse asyncResponse, final YaasAwareParameters yaasAware,
			final java.lang.String wishlistId, final Wishlist wishlist) {
		// please provide some async response logic here
		// you may run time consuming logic in the separate thread, but still
		// remember to resume processing of the http request at the end of the
		// separate thread flow
		// for more details refer to
		// https://jersey.java.net/documentation/latest/async.html or SDK
		// documentation

		asyncResponse.resume(Response.ok().build());
	}

	/* DELETE /{wishlistId} */
	@Override
	public void deleteByWishlistId(@Suspended final AsyncResponse asyncResponse, final YaasAwareParameters yaasAware,
			final java.lang.String wishlistId) {
		// please provide some async response logic here
		// you may run time consuming logic in the separate thread, but still
		// remember to resume processing of the http request at the end of the
		// separate thread flow
		// for more details refer to
		// https://jersey.java.net/documentation/latest/async.html or SDK
		// documentation

		asyncResponse.resume(Response.noContent().build());
	}

	@Override
	public void getByWishlistIdWishlistItems(AsyncResponse asyncResponse, final PagedParameters paged,
			YaasAwareParameters yaasAware, String wishlistId) {
		asyncResponse.resume(Response.ok().entity(new java.util.ArrayList<>()).build());

	}

	@Override
	public void postByWishlistIdWishlistItems(AsyncResponse asyncResponse, YaasAwareParameters yaasAware,
			String wishlistId, WishlistItem wishlistItem) {
		asyncResponse.resume(Response.created(uriInfo.getAbsolutePath()).build());

	}

}
