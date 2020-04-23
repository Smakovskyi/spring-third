package ua.kpi.view;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class View {

  public View() {
    System.out.println("===============View instance is created============");
  }

  public void print(String value) {
    System.out.println(value);
  }
}
