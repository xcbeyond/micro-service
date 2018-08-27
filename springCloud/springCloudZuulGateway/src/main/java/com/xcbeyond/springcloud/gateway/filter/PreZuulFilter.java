package com.xcbeyond.springcloud.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * 前置过滤器
 * @author xcbeyond
 * 2018年8月27日上午11:37:07
 */
public class PreZuulFilter extends ZuulFilter{

	/**
	 * 返回过滤器的类型：pre、route、post、error
	 */
	@Override
	public String filterType() {
		return "pre";
	}
	
	/**
	 * 定义过滤器的执行顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}
	
	/**
	 * 返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关。</br>
	 * @return
	 * 		true	该过滤器总是生效
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}
	
	/**
	 * 过滤器的具体逻辑
	 */
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println("request pathInfo:" + request.getPathInfo());
		System.out.println("request method:" + request.getMethod());

		return null;
	}

	

	

	
	
}
