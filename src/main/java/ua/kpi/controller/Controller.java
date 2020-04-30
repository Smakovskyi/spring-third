package ua.kpi.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.kpi.context.ContextAdapter;
import ua.kpi.entities.Commodity;
import ua.kpi.services.CommodityService;
import ua.kpi.view.View;
import ua.kpi.view.Viewable;

@Setter
@Component
public class Controller {

  private final CommodityService commodityService;
  private final Viewable view;

  @Qualifier("firstAdapter")
  private final ContextAdapter adapter;


  public Controller(CommodityService commodityService, Viewable view,
      @Qualifier("firstAdapter")  ContextAdapter adapter) {
    this.commodityService = commodityService;
    this.view = view;
    this.adapter = adapter;
  }

  public void processUser() {
    List<Commodity> all = commodityService.findAll();
    getView().print(all.toString());
  }

  private Viewable getView(){
    System.out.println("adapter = " + adapter);
    return adapter.getApplicationContext().getBean("view", Viewable.class);
  }

}
