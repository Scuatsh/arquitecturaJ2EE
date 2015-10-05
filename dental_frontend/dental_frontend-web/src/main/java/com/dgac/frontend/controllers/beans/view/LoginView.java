/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dgac.frontend.controllers.beans.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
//import javax.faces.view.ViewScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Leo Jerez
 */
@Named("loginView")
//@ManagedBean (name="loginView")
@ViewScoped
//@RequestScoped
public class LoginView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<String> items;
  private String item;

  @PostConstruct
  public void init() {
    items = new ArrayList();
    items.add("Item 1");
    items.add("Item 2");
    items.add("Item 3");
  }

  public void addItem() {
    if (item != null && !item.isEmpty()) {
      items.add(item);
      item = null;
    }
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public List<String> getItems() {
    return items;
  }
}
