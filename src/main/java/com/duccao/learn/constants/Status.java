package com.duccao.learn.constants;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

/**
 * Status enum class.
 *
 * @author thinhphamtx
 * @version 1.0
 * @since 2022/05/13
 */
@Getter
public enum Status {
  INACTIVE(0), ACTIVE(1);

  private final int value;

  private static final Map<Integer, Status> lookup = new HashMap<>();

  static {
    for (Status d : Status.values()) {
      lookup.put(d.getValue(), d);
    }
  }

  Status(int intValue) {
    this.value = intValue;
  }

  public static Status fromValue(Integer intValue) {
    return lookup.get(intValue);
  }

}
