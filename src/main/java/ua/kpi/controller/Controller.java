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

@Setter
@Component
public class Controller {

  private final CommodityService commodityService;
  private final View view;

  @Qualifier("firstAdapter")
  private final ContextAdapter adapter;


  public Controller(CommodityService commodityService, View view,
      @Qualifier("firstAdapter")  ContextAdapter adapter) {
    this.commodityService = commodityService;
    this.view = view;
    this.adapter = adapter;
  }

  public void processUser() {
    List<Commodity> all = commodityService.findAll();
    getView().print(all.toString());
  }

  private View getView(){
    System.out.println("adapter = " + adapter);
    return adapter.getApplicationContext().getBean("view", View.class);
  }

}
