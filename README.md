# X-Clacks-Overhead: GNU Terry Pratchett

An example Spring interceptor for adding [GNU Terry Pratchett](http://www.gnuterrypratchett.com/) headers
to HTTP responses.

## Usage

Interceptors must be registered before they're applied. The following configuration class in a Spring Boot project
 would do the trick:

```java
import org.incognitjoe.clacks.interceptors.ClacksOverheadInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Import(ClacksOverheadInterceptor.class)
public class RestConfig implements WebMvcConfigurer {

    @Autowired
    private ClacksOverheadInterceptor clacksOverheadInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(clacksOverheadInterceptor);
    }
}
```

