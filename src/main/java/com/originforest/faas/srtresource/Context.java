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
   * value form request header
   * @param key specify header name
   * @return values list
   */
  public List<String> getHeader(String key);

  /**
   * parsed query parameters
   * @return parameters with key-value style map
   */
  public Map<String,List<String>> getQuery();
}
