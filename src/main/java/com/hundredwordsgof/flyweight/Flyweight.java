package com.hundredwordsgof.flyweight;

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
 
 // It's me Jon P

public interface Flyweight {

  void operation(Object extrinsicState);
}
