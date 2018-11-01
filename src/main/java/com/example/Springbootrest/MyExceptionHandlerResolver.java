package com.example.Springbootrest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
@Component
public class MyExceptionHandlerResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", ex);
	    mav.addObject("name","kishan");
	    mav.addObject("url", request.getRequestURL());
	    //mav.setViewName(DEFAULT_ERROR_VIEW);
	    return mav;	    
	}

}
