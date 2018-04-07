package org.incognitjoe.clacks.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ClacksOverheadInterceptor extends HandlerInterceptorAdapter {

    private static final String X_CLACKS_OVERHEAD = "X-Clacks-Overhead";
    private static final String GNU_TERRY = "GNU Terry Pratchett";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        response.addHeader(X_CLACKS_OVERHEAD, GNU_TERRY);
        return true;
    }

}
