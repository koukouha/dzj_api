package com.dzj.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by hongbo.gao on 2018/1/3.
 */
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(RequestContextFilter.class);
		//配置restful package.
		packages("com.dzj.api");
	}
}
