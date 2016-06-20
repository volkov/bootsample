package ru.volkov.bootsample.entity;

import org.springframework.data.annotation.Id;

/**
 * User: serg-v
 * Date: 6/20/16
 * Time: 11:39 PM
 */
public class Location {

  @Id
  private String id;

  private String name;

  private String description;

  public Location() {
  }

  public Location(final String name, final String description) {
    this.name = name;
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setDescription(final String description) {
    this.description = description;
  }
}
