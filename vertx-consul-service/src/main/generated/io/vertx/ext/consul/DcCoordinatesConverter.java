/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.ext.consul.DcCoordinates}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.consul.DcCoordinates} original class using Vert.x codegen.
 */
public class DcCoordinatesConverter {

  public static void fromJson(JsonObject json, DcCoordinates obj) {
    if (json.getValue("datacenter") instanceof String) {
      obj.setDatacenter((String)json.getValue("datacenter"));
    }
    if (json.getValue("servers") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.ext.consul.Coordinate> list = new java.util.ArrayList<>();
      json.getJsonArray("servers").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.ext.consul.Coordinate((JsonObject)item));
      });
      obj.setServers(list);
    }
  }

  public static void toJson(DcCoordinates obj, JsonObject json) {
    if (obj.getDatacenter() != null) {
      json.put("datacenter", obj.getDatacenter());
    }
    if (obj.getServers() != null) {
      JsonArray array = new JsonArray();
      obj.getServers().forEach(item -> array.add(item.toJson()));
      json.put("servers", array);
    }
  }
}