// Generated by Dagger (https://google.github.io/dagger).
package com.weike.education.di.module;

import com.weike.education.network.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class ApiModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideApiServiceFactory(ApiModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideInstance(module, retrofitProvider);
  }

  public static ApiService provideInstance(ApiModule module, Provider<Retrofit> retrofitProvider) {
    return proxyProvideApiService(module, retrofitProvider.get());
  }

  public static ApiModule_ProvideApiServiceFactory create(
      ApiModule module, Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService proxyProvideApiService(ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.provideApiService(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}