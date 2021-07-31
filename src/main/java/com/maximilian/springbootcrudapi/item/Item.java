package com.maximilian.springbootcrudapi.item;

public class Item {

  private long id;
  private String name;

  public Item() {}

  public Item(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Item(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Item{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}