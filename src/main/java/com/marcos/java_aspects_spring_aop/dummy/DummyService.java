package com.marcos.java_aspects_spring_aop.dummy;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

  public void dummy() {
    System.out.println("Dummy from DummyService");
  }
}
