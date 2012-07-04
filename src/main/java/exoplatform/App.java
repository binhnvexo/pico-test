package exoplatform;

import java.util.List;

import org.exoplatform.MovieFinder;
import org.exoplatform.impl.MovieFinderImpl;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(MovieLister.class);
        pico.addComponent(MovieFinderImpl.class);
        MovieLister lister = (MovieLister) pico.getComponent(MovieLister.class);
        List<String> list = lister.finder.findAll();
        for (String string : list) {
          System.out.println(string);
        }
    }
}
