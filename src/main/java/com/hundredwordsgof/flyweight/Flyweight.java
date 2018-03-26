package com.hundredwordsgof.flyweight;

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
 
 //Zach Sotak
 
 
public interface Flyweight {

  void operation(Object extrinsicState);
}
