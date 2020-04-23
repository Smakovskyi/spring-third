package ua.kpi;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("adapter")
@Getter
public class ApplicationContextAdapter {
  @Autowired
  private ApplicationContext applicationContext;
}
