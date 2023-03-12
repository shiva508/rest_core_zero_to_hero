package com.pool.intro.QueryParam;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

@Path("/queryParam")
public class QueryParamService {
	@GET
public String queryParamOne(@QueryParam("stateCode")String stateCode) {
	return "Query Param is:"+stateCode;
}
	@GET
	@Path("/two")
	public String queryParamTwo(@DefaultValue("4")@QueryParam("pageStart")int pageStart,@DefaultValue("100")@QueryParam("pageEnd")int pageEnd) {
		return "Good chapter starts at "+pageStart+" to "+pageEnd;
	}
	@GET
	@Path("/context")
	public String context(@Context UriInfo uriInfo) {
		MultivaluedMap<String, String> params=uriInfo.getPathParameters();
		return ""+params.getFirst("pageStart");
	}
	@GET
	@Path("/path/{a}/query")
	public String pathAndQuery(@PathParam("a")String a,@QueryParam("b")String b) {
		return "Path="+a+",Query="+b;
	}
}
