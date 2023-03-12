package com.pool.intro.FineTuningResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/finetune")
public class FineTuneResponseService {
	@GET
	@Path("/ok")
	@Produces(MediaType.APPLICATION_XML)
	public Response goodResponse() {
		User user = new User();
		user.setName("Shiva");
		return Response.status(Response.Status.OK)
				.entity(user)
				.build();
	}
}
