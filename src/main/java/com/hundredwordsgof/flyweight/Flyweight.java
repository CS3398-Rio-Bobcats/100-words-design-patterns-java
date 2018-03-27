package com.hundredwordsgof.flyweight;

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
// sifa vahora's comment
public interface Flyweight {

  void operation(Object extrinsicState);
}
