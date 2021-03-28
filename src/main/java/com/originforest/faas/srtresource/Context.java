/*
 * FaaS Java Runtime
 * Context object
 * --------------------
 * Author: Moyu Su (Fiathux Su)
 * Date: 2021-03-15
 * Desc:
 */

package com.originforest.faas.srtresource;

import java.util.Map;
import java.util.List;

/**
 * function context
 */
public interface Context {
  /**
   * user's tenant ID
   * @return tenant ID
   */
  public String getTenantID();

  /**
   * function ID
   * @return function ID
   */
  public String getFnID();

  /**
   * resource path name
   * @return resource path name
   */
  public String getResource();

  /**
   * event ID
   * @return event ID
   */
  public String getEventID();

   /**
   * request unique ID
   * @return request ID
   */
  public String getRequestID();

  /**
   * request host name
   * @return host name
   */
  public String getHostname();

  /**
   * request method that allow using RESTful style actions
   * @return method
   */
  public String getMethod();

  /**
   * values from request header
   * @param key specify header name
   * @return values list
   */
  public List<String> getHeader(String key);

  /**
   * list all header names
   * @return list of keys
   */
  public List<String> getHeaderNames();

  /**
   * parsed query parameters
   * @param key name of query argument
   * @return parameters with key-value style map
   */
  public List<String> getQuery(String key);

  /**
   * raw query string
   * @return parameters with key-value style map
   */
  public String getRawQuery();

  /**
   * list all query keys in query string
   * @return list of keys
   */
  public List<String> getQueryNames();
}
