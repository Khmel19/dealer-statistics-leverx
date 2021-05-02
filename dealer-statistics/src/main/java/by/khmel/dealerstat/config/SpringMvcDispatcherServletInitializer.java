package by.khmel.dealerstat.config;

import by.khmel.dealerstat.config.dataconfig.DataConfig;
import by.khmel.dealerstat.config.emailconfig.EmailConfig;
import by.khmel.dealerstat.config.securityconfig.SecurityConfig;
import by.khmel.dealerstat.config.webconfig.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DataConfig.class, SecurityConfig.class, EmailConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
