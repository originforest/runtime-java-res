/*
 * FaaS Java Runtime
 * Event object
 * --------------------
 * Author: Moyu Su (Fiathux Su)
 * Date: 2021-03-15
 * Desc:
 */

package com.originforest.faas.srtresource;

import java.io.InputStream;

/**
 * function event object
 */
public interface Event {
  /**
   * content mime-type
   * @return content type
   */
  public String getContentType();

  /**
   * length of content data in bytes
   * @return content length
   */
  public long getContentLength();

  /**
   * content reader
   * @return content IO
   */
  public InputStream getBody();

  /**
   * response writer that provide methods to write content manually
   * @return EventResult object
   */
  public EventResult getResultWriter();
}
