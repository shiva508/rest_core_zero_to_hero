package com.pool;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("/api")
public class RestEnd extends Application {
	/*
	 * @ApplicationPath: This annotation identifies the application path that serves
	 * as the base URI for all resources. This should be used on the configuration
	 * class
	 */
	/*
	 * @Path: Identifies the URI path that a resource class or class method will
	 * serve requests for. That means we have to create a class annotated with @Path
	 * and define relative path to base URI (specified on Application class).
	 */
	/*
	 * @PathParam : This annotation is used to extract the value of a URI template
	 * variables.
	 */
	/* @QueryParam is used to handle query parameters. */
}
