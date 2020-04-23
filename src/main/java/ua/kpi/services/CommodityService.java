package ua.kpi.services;

import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.kpi.dao.CommodityDAO;
import ua.kpi.entities.Commodity;
import ua.kpi.view.View;


@Setter
@Component
public class CommodityService {

  public CommodityService(CommodityDAO commodityDAO) {
    this.commodityDAO = commodityDAO;
    System.out.println("Constructor view = " + view);
  }

  private final CommodityDAO commodityDAO;

  @Autowired
  private View view;

  @PostConstruct
  public void init(){
    System.out.println("This call should be after properties set. view = " + view);
  }

  public Optional<Commodity> findById(int id) {
    return commodityDAO.findById(id);
  }

  public List<Commodity> findAll() {
    return commodityDAO.findAll();
  }

}
