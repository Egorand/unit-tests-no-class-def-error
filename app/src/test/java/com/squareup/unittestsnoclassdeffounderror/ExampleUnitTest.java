package com.squareup.unittestsnoclassdeffounderror;

import com.squareup.testutils.TestUtil;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExampleUnitTest {
  private TestUtil testUtil = new TestUtil();

  @Test public void testHashCode() {
    assertTrue(testUtil.getHashCode() < Long.MAX_VALUE);
  }
}