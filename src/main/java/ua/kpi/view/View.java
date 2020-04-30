package ua.kpi.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
@Scope(scopeName = "prototype")
public class View implements Viewable{

  @Value("${viewable.filler}")
  private String filler;

  public View() {
    System.out.println(filler + "View instance is created" + filler);
  }

  public void print(String value) {
    System.out.println(value);
  }
}
