package com.squareup.testutils;

import com.squareup.java_lib.MyClass;

public class TestUtil {
  public int getHashCode() {
    String str = new MyClass().makeString();
    return str.hashCode();
  }
}
