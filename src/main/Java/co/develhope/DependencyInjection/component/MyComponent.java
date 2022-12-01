package co.develhope.DependencyInjection.component;
import org.springframework.stereotype.Component;


@Component
public class MyComponent {


    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor");
        this.myComponentName = "Claudio";
    }

    public String getMyComponentName(){
        final String myComponentImmutableName = this.myComponentName;
        return myComponentImmutableName;
    }
}
