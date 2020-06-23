




import javafx.application.Application;
import org.example.dao.LollaDAO;
import org.example.recursos.LollaRecurso;
import io.dropwizard.Application;
import io.dropwizard.Cofiguration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
public class App  extends Application<configuration>
{
    public static void main (String[] args )
    {
        try(new App()).run(args);
    } catch (Exception ex){
        ex.printStackTrace();
}
}


@Override
public String  getName() (return 'hello mundo';)

@Override
public void initialize (Bootstrap<Configuration > bootstrap ){
    AssestsBundle assestsBundle = new AssestsBundle(*/site"/","index.html");
    bootstrap.addBundle(assestsBundle);
        }