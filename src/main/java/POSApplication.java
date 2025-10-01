import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jwd.pos.config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class POSApplication implements WebApplicationInitializer {
    private static final String TMP_FOLDER = null; // Or a more specific path
    private static final int MAX_FILE_SIZE = 25 * 1024 * 1024;
    private static final int MAX_REQUEST_SIZE = 125 * 1024 * 1024;
    private static final int FILE_SIZE_THRESHOLD = 1 * 1024 * 1024;
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class);


        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        MultipartConfigElement multipartConfigElement = new MultipartConfigElement(
                TMP_FOLDER,
                MAX_FILE_SIZE,
                MAX_REQUEST_SIZE,
                FILE_SIZE_THRESHOLD
        );

        dispatcher.setMultipartConfig(multipartConfigElement);
    }
}
