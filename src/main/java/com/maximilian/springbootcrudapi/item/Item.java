package com.maximilian.springbootcrudapi.item;

import javax.persistence.*;

@Entity
@Table
public class Item {

  @Id
  @SequenceGenerator(name = "item_sequence", sequenceName = "item_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_sequence")

  private Long id;
  private String name;

  public Item() {}

  public Item(Long id, String name) {
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
