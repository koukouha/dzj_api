package com.dzj.api.controller;

import com.dzj.api.dao.DzjCategoryMapper;
import com.dzj.api.model.DzjCategory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hongbo.gao on 2018/1/3.
 */
@Path("/category")
public class GetDzjCategory {

	@Autowired
	DzjCategoryMapper dzjCategoryMapper;

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public DzjCategory getResource(@PathParam("id") Integer categoryId) {

		return dzjCategoryMapper.selectByPrimaryKey(categoryId);

	}
}
