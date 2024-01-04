package io.github.llh4github.smmtemplate.api.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 *
 *
 * Created At 2024/1/3 9:51
 * @author llh
 */
@Configuration
class WebBaseConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedHeaders("*")
            .allowedMethods("*")
//            .allowCredentials(true)
//            .maxAge(3600)
    }
}
