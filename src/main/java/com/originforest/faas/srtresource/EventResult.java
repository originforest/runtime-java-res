/*
 * FaaS Java Runtime
 * EventResult object
 * --------------------
 * Author: Moyu Su (Fiathux Su)
 * Date: 2021-03-15
 * Desc:
 */

package com.originforest.faas.srtresource;

import java.io.OutputStream;
import java.util.List;

/**
 * function result object
 */
public interface EventResult {
  /**
   * status code
   * @return HTTP status code
   */
  public int getStatus();

  /**
   * set status code.
   * this method only avaliable before write content to response.
   * @param status set status code
   */
  public void setStatus(int status);

  /**
   * item from response headers
   * @param key item name in headers
   * @return values
   */
  public List<String> getHeader(String key);

  /**
   * set item to response headers
   * @param key item name in headers
   * @param values a string list for set multiple values
   */
  public void setHeader(String key, List<String> values);

   /**
   * set item to response headers
   * @param key item name in headers
   * @param value set single string value
   */
  public void setHeader(String key, String value);

  /**
   * content IO
   * @return content IO streamer
   */
  public OutputStream getResponseBody();
}
