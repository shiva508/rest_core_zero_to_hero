package com.pool.intro.PathRegex;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/regexservice/")
public class PathRegexService {
	@GET
	@Path("{a:\\d{3,5}}")
	public String getRegex1(@PathParam("a") String regex) {
		return regex;
	}
	@GET
	@Path("{regex:[a-z]\\d{2,3}}")
	public String getRegex2(@PathParam("regex")String regex) {
		return regex;	
	}
}
