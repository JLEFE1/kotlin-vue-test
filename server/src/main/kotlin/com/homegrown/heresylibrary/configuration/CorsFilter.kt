package com.homegrown.heresylibrary.configuration

import org.springframework.context.annotation.Configuration
import javax.servlet.http.HttpServletResponse
import java.io.IOException
import javax.servlet.*

@Configuration
class CorsFilter : Filter {
    @Throws(IOException::class, ServletException::class)
    override fun doFilter(req: ServletRequest, resp: ServletResponse, chain: FilterChain) {
        val response = resp as HttpServletResponse
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080")
        response.setHeader("Access-Control-Allow-Origin", "*")
        response.setHeader("Access-Control-Allow-Credentials", "false")
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE")
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, Content-Type, X-Requested-With, accept, Access-Control-Request-Method, Access-Control-Request-Headers, Authorization")
        response.setHeader("Access-Control-Expose-Headers",
                "Origin, Access-Control-Request-Method, Access-Control-Allow-Origin, Access-Control-Allow-Credentials")
        response.setHeader("Access-Control-Max-Age", "4000")
        chain.doFilter(req, resp)
    }

    @Throws(ServletException::class)
    override fun init(filterConfig: FilterConfig) {
    }

    override fun destroy() {}
}