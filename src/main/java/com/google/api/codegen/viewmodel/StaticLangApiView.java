/* Copyright 2016 Google Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen.viewmodel;

import com.google.auto.value.AutoValue;
import java.util.List;
import javax.annotation.Nullable;

@AutoValue
public abstract class StaticLangApiView {
  public abstract ServiceDocView doc();

  public abstract String name();

  @Nullable // Used in C#
  public abstract String implName();

  @Nullable // Used in C#
  public abstract String grpcServiceName();

  @Nullable // Used in C#
  public abstract String grpcTypeName();

  @Nullable // Used in C#
  public abstract List<ReroutedGrpcView> reroutedGrpcClients();

  public abstract String settingsClassName();

  public abstract List<ApiCallableView> apiCallableMembers();

  public abstract List<PathTemplateView> pathTemplates();

  public abstract List<FormatResourceFunctionView> formatResourceFunctions();

  public abstract List<ParseResourceFunctionView> parseResourceFunctions();

  public abstract List<StaticLangApiMethodView> apiMethods();

  @Nullable // Used in C#
  public abstract List<StaticLangApiMethodView> apiMethodsImpl();

  public abstract boolean hasDefaultInstance();

  public static Builder newBuilder() {
    return new AutoValue_StaticLangApiView.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder doc(ServiceDocView val);

    public abstract Builder name(String val);

    public abstract Builder implName(String val);

    public abstract Builder grpcServiceName(String val);

    public abstract Builder grpcTypeName(String val);

    public abstract Builder reroutedGrpcClients(List<ReroutedGrpcView> val);

    public abstract Builder settingsClassName(String val);

    public abstract Builder apiCallableMembers(List<ApiCallableView> val);

    public abstract Builder pathTemplates(List<PathTemplateView> val);

    public abstract Builder formatResourceFunctions(List<FormatResourceFunctionView> val);

    public abstract Builder parseResourceFunctions(List<ParseResourceFunctionView> val);

    public abstract Builder apiMethods(List<StaticLangApiMethodView> val);

    public abstract Builder apiMethodsImpl(List<StaticLangApiMethodView> val);

    public abstract Builder hasDefaultInstance(boolean val);

    public abstract StaticLangApiView build();
  }
}