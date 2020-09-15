
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirLoadPage}.
 */
@ApiParams(apiName = "load-page", description = "",
           apiMethods = {@ApiMethod(methodName = "byUrl"), @ApiMethod(methodName = "next"), @ApiMethod(methodName = "previous")})
@UriParams
@Configurer
public final class FhirLoadPageEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "byUrl"), @ApiMethod(methodName = "next"), @ApiMethod(methodName = "previous")})
    private org.hl7.fhir.instance.model.api.IBaseBundle bundle;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "byUrl"), @ApiMethod(methodName = "next"), @ApiMethod(methodName = "previous")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "byUrl"), @ApiMethod(methodName = "next"), @ApiMethod(methodName = "previous")})
    private Class<org.hl7.fhir.instance.model.api.IBaseBundle> returnType;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "byUrl"), @ApiMethod(methodName = "next"), @ApiMethod(methodName = "previous")})
    private String url;

    public org.hl7.fhir.instance.model.api.IBaseBundle getBundle() {
        return bundle;
    }

    public void setBundle(org.hl7.fhir.instance.model.api.IBaseBundle bundle) {
        this.bundle = bundle;
    }

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseBundle> getReturnType() {
        return returnType;
    }

    public void setReturnType(Class<org.hl7.fhir.instance.model.api.IBaseBundle> returnType) {
        this.returnType = returnType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
