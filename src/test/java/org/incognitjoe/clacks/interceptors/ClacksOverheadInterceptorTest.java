package org.incognitjoe.clacks.interceptors;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.Assert.assertEquals;

public class ClacksOverheadInterceptorTest {


    private MockHttpServletRequest request = new MockHttpServletRequest("GET", "/");

    private MockHttpServletResponse response = new MockHttpServletResponse();


    @Test
    public void preHandle_adds_GNU_Terry_Pratchett_header() throws Exception {
        ClacksOverheadInterceptor interceptor = new ClacksOverheadInterceptor();

        interceptor.preHandle(request, response, null);

        assertEquals("GNU Terry Pratchett", response.getHeader("X-Clacks-Overhead"));

    }

}