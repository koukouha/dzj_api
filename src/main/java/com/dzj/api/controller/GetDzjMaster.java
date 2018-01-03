package com.dzj.api.controller;

import com.dzj.api.dao.DzjMasterMapper;
import com.dzj.api.model.DzjMaster;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hongbo.gao on 2018/1/3.
 */
@Path("/book")
public class GetDzjMaster {

	@Autowired
	DzjMasterMapper dzjMasterMapper;

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public DzjMaster getResource(@PathParam("id") Integer dzjId) {

		return dzjMasterMapper.selectByPrimaryKey(dzjId);

	}
}
