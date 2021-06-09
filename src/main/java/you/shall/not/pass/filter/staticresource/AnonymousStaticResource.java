package you.shall.not.pass.filter.staticresource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import you.shall.not.pass.domain.Access;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class AnonymousStaticResource implements StaticResourceValidator {

    private static final Logger LOG = LoggerFactory.getLogger(HighLevelStaticResource.class);

    @Value("classpath:static/Anon/**")
    private Resource[] level0;

    @Autowired
    private StaticResourceService staticResourceService;

    private List<String> staticResources;

    @PostConstruct
    public void setList() {
        staticResources = staticResourceService.resolveStaticResources(level0);
        LOG.info("{} level resources: {}", requires(), staticResources);
    }

    @Override
    public boolean isApplicable(String requestUri) {
        //Returning false under assumption that Anon access doesn't need access validations
        return false;
    }

    @Override
    public Access requires() {
        return Access.ANONYMOUS;
    }
}
