package ua.kpi.services;

import java.util.List;
import java.util.Optional;
import lombok.Setter;
import ua.kpi.dao.CommodityDAO;
import ua.kpi.entities.Commodity;
import ua.kpi.view.View;


@Setter
public class CommodityService {

  public CommodityService(CommodityDAO commodityDAO) {
    this.commodityDAO = commodityDAO;
  }

  private CommodityDAO commodityDAO;

  private View view;

  public Optional<Commodity> findById(int id) {
    return commodityDAO.findById(id);
  }

  public List<Commodity> findAll() {
    return commodityDAO.findAll();
  }

}
