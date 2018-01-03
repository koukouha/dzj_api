package com.dzj.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by hongbo.gao on 2018/1/3.
 */
@Path("/")
public class BookDataController {

	@Path("/book")
	@GET
	public String getResource() {

		return "hello clent";

	}
}
