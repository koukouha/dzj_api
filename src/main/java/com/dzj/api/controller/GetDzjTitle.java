package com.dzj.api.controller;

import com.dzj.api.dao.DzjMasterMapper;
import com.dzj.api.model.DzjMaster;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by hongbo.gao on 2018/1/3.
 */
@Path("/title")
public class GetDzjTitle {

	@Autowired
	DzjMasterMapper dzjMasterMapper;

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DzjMaster> getResource(@PathParam("id") Integer categoryId) {

		return dzjMasterMapper.selectTitleByCategoryKey(categoryId);

	}
}
