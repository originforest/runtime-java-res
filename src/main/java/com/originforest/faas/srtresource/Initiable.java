package com.originforest.faas.srtresource;

import java.util.Map;

public abstract class Initiable implements Handler {
  public Initiable() {
  }

  public Initiable(Map<String, String> param) {
  }

  public abstract byte[] handler(Context ctx, Event evt) throws Exception;
}
