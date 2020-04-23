package ua.kpi.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import ua.kpi.entities.Commodity;

public class CommodityDAO {

  private List<Commodity> commodities = new ArrayList<>();

  {
    commodities.add(Commodity.builder().id(1).name("aaa").price(10).build());
    commodities.add(Commodity.builder().id(2).name("bbb").price(15).build());
  }

  public Optional<Commodity> findById(int id) {
    return commodities.stream().filter(c -> c.getId() == id).findFirst();
  }

  public List<Commodity> findAll() {
    return commodities;
  }
  //TODO U& D

}
