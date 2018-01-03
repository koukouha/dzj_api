package com.dzj.api.controller;

import com.dzj.api.dao.DzjCategoryMapper;
import com.dzj.api.model.DzjCategory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by hongbo.gao on 2018/1/3.
 */
@Path("/category")
public class GetAllDzjCategory {

	@Autowired
	DzjCategoryMapper dzjCategoryMapper;

	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DzjCategory> getResource() {

		return dzjCategoryMapper.selectAll();

	}
}
