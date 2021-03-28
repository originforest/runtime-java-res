package com.originforest.faas.srtresource;

public interface Handler {
  byte[] handler(Context ctx, Event evt) throws Exception;
}
