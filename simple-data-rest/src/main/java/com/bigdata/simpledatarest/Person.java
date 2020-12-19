package com.bigdata.simpledatarest;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
//import org.neo4j.ogm.annotation.NodeEntity;

//@NodeEntity
public class Person {

  @Id @GeneratedValue private Long id;

  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}