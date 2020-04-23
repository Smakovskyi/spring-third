package ua.kpi.controller;

import java.util.List;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import ua.kpi.ApplicationContextAdapter;
import ua.kpi.SecondAdapter;
import ua.kpi.entities.Commodity;
import ua.kpi.services.CommodityService;
import ua.kpi.view.View;

@Setter
public class Controller {

  private CommodityService commodityService;
  private View view;
  private ApplicationContextAdapter adapter;
  private SecondAdapter secondAdapter;



  public void processUser() {
    List<Commodity> all = commodityService.findAll();
    getView().print(all.toString());

  }

  private View getView(){
    return secondAdapter.getApplicationContext().getBean("view", View.class);
  }

}
