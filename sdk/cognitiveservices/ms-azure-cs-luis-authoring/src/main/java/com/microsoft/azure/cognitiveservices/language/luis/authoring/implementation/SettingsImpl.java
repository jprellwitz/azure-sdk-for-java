/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.Settings;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.AppVersionSettingObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.OperationStatus;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Settings.
 */
public class SettingsImpl implements Settings {
    /** The Retrofit service to perform REST calls. */
    private SettingsService service;
    /** The service client containing this operation class. */
    private LUISAuthoringClientImpl client;

    /**
     * Initializes an instance of SettingsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SettingsImpl(Retrofit retrofit, LUISAuthoringClientImpl client) {
        this.service = retrofit.create(SettingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Settings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SettingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.authoring.Settings list" })
        @GET("apps/{appId}/versions/{versionId}/settings")
        Observable<Response<ResponseBody>> list(@Path("appId") UUID appId, @Path("versionId") String versionId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.authoring.Settings update" })
        @PUT("apps/{appId}/versions/{versionId}/settings")
        Observable<Response<ResponseBody>> update(@Path("appId") UUID appId, @Path("versionId") String versionId, @Body List<AppVersionSettingObject> listOfAppVersionSettingObject, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;AppVersionSettingObject&gt; object if successful.
     */
    public List<AppVersionSettingObject> list(UUID appId, String versionId) {
        return listWithServiceResponseAsync(appId, versionId).toBlocking().single().body();
    }

    /**
     * Gets the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AppVersionSettingObject>> listAsync(UUID appId, String versionId, final ServiceCallback<List<AppVersionSettingObject>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(appId, versionId), serviceCallback);
    }

    /**
     * Gets the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AppVersionSettingObject&gt; object
     */
    public Observable<List<AppVersionSettingObject>> listAsync(UUID appId, String versionId) {
        return listWithServiceResponseAsync(appId, versionId).map(new Func1<ServiceResponse<List<AppVersionSettingObject>>, List<AppVersionSettingObject>>() {
            @Override
            public List<AppVersionSettingObject> call(ServiceResponse<List<AppVersionSettingObject>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AppVersionSettingObject&gt; object
     */
    public Observable<ServiceResponse<List<AppVersionSettingObject>>> listWithServiceResponseAsync(UUID appId, String versionId) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (versionId == null) {
            throw new IllegalArgumentException("Parameter versionId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.list(appId, versionId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<AppVersionSettingObject>>>>() {
                @Override
                public Observable<ServiceResponse<List<AppVersionSettingObject>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<AppVersionSettingObject>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<AppVersionSettingObject>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<AppVersionSettingObject>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<AppVersionSettingObject>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Updates the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listOfAppVersionSettingObject A list of the updated application version settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    public OperationStatus update(UUID appId, String versionId, List<AppVersionSettingObject> listOfAppVersionSettingObject) {
        return updateWithServiceResponseAsync(appId, versionId, listOfAppVersionSettingObject).toBlocking().single().body();
    }

    /**
     * Updates the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listOfAppVersionSettingObject A list of the updated application version settings.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatus> updateAsync(UUID appId, String versionId, List<AppVersionSettingObject> listOfAppVersionSettingObject, final ServiceCallback<OperationStatus> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(appId, versionId, listOfAppVersionSettingObject), serviceCallback);
    }

    /**
     * Updates the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listOfAppVersionSettingObject A list of the updated application version settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<OperationStatus> updateAsync(UUID appId, String versionId, List<AppVersionSettingObject> listOfAppVersionSettingObject) {
        return updateWithServiceResponseAsync(appId, versionId, listOfAppVersionSettingObject).map(new Func1<ServiceResponse<OperationStatus>, OperationStatus>() {
            @Override
            public OperationStatus call(ServiceResponse<OperationStatus> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the settings in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listOfAppVersionSettingObject A list of the updated application version settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> updateWithServiceResponseAsync(UUID appId, String versionId, List<AppVersionSettingObject> listOfAppVersionSettingObject) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (versionId == null) {
            throw new IllegalArgumentException("Parameter versionId is required and cannot be null.");
        }
        if (listOfAppVersionSettingObject == null) {
            throw new IllegalArgumentException("Parameter listOfAppVersionSettingObject is required and cannot be null.");
        }
        Validator.validate(listOfAppVersionSettingObject);
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.update(appId, versionId, listOfAppVersionSettingObject, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatus>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatus>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatus> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatus> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatus, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatus>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
