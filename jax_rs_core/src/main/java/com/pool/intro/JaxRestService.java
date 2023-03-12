package com.pool.intro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/welcome")
public class JaxRestService {
	@GET
	public  String welcome() {
		return "Welcome";
	}
	@GET
	@Path("/{name}")
	public String welcomeforone(@PathParam("name")String name) {
		return "Welcome "+name;
	}
	@GET
	@Path("/{name}/male")
	public String welcomeformale(@PathParam("name")String name) {
		return "Welcome MR."+name;
	}
	@GET
	@Path("/{name1}/and/{name2}")
	public String welcomefortwopeople(@PathParam("name1")String name1,@PathParam("name2") String name2) {
		return "Welcome "+name1 +","+name2;
	}
}
