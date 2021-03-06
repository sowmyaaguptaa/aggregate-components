/* Copyright (c) 2010 Vinay Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gwt.maps.client.geocoder.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

/**
 * 
 *
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public interface GeocoderRequestImpl extends JSFlyweightWrapper {

  public GeocoderRequestImpl impl = GWT.create(GeocoderRequestImpl.class);
  
  @Constructor("Object")
  public JavaScriptObject construct();
  
  @BeanProperties
  public String getAddress(JavaScriptObject jso);
  
  @BeanProperties
  public void setAddress(JavaScriptObject jso, String address);
  
  @BeanProperties
  public JavaScriptObject getBounds(JavaScriptObject jso);
  
  @BeanProperties
  public void setBounds(JavaScriptObject jso, JavaScriptObject bounds);
  
  @BeanProperties
  public String getLanguage(JavaScriptObject jso);
  
  @BeanProperties
  public void setLanguage(JavaScriptObject jso, String language);
  
  @BeanProperties
  public JavaScriptObject getLatLng(JavaScriptObject jso);
  
  @BeanProperties
  public void setLatLng(JavaScriptObject jso, JavaScriptObject latLng);
  
  @BeanProperties
  public String getRegion(JavaScriptObject jso);
  
  @BeanProperties
  public void setRegion(JavaScriptObject jso, String region);
}
