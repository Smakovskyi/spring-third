package ua.kpi.context;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("firstAdapter")
@Getter
public class ApplicationContextAdapter implements  ContextAdapter{
  @Autowired
  private ApplicationContext applicationContext;
}
