
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
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirPatch}.
 */
@ApiParams(apiName = "patch", description = "API for the patch operation, which performs a logical patch on a server resource",
           apiMethods = {@ApiMethod(methodName = "patchById", description="Applies the patch to the given resource ID"), @ApiMethod(methodName = "patchByUrl", description="Specifies that the update should be performed as a conditional create against a given search URL")})
@UriParams
@Configurer
public final class FhirPatchEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "patchById", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "patchById", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "patchByUrl", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "patchById", description="The resource ID to patch"), @ApiMethod(methodName = "patchById", description="The resource ID to patch"), @ApiMethod(methodName = "patchByUrl", description="The resource ID to patch")})
    private org.hl7.fhir.instance.model.api.IIdType id;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "patchById", description="The body of the patch document serialized in either XML or JSON which conforms to http://jsonpatch.com/ or http://tools.ietf.org/html/rfc5261"), @ApiMethod(methodName = "patchById", description="The body of the patch document serialized in either XML or JSON which conforms to http://jsonpatch.com/ or http://tools.ietf.org/html/rfc5261"), @ApiMethod(methodName = "patchByUrl", description="The body of the patch document serialized in either XML or JSON which conforms to http://jsonpatch.com/ or http://tools.ietf.org/html/rfc5261")})
    private String patchBody;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "patchById", description="Add a Prefer header to the request, which requests that the server include or suppress the resource body as a part of the result. If a resource is returned by the server it will be parsed an accessible to the client via MethodOutcome#getResource()"), @ApiMethod(methodName = "patchById", description="Add a Prefer header to the request, which requests that the server include or suppress the resource body as a part of the result. If a resource is returned by the server it will be parsed an accessible to the client via MethodOutcome#getResource()"), @ApiMethod(methodName = "patchByUrl", description="Add a Prefer header to the request, which requests that the server include or suppress the resource body as a part of the result. If a resource is returned by the server it will be parsed an accessible to the client via MethodOutcome#getResource()")})
    private ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "patchById", description="The resource ID to patch"), @ApiMethod(methodName = "patchById", description="The resource ID to patch"), @ApiMethod(methodName = "patchByUrl", description="The resource ID to patch")})
    private String stringId;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "patchById", description="The search URL to use. The format of this URL should be of the form ResourceTypeParameters, for example: Patientname=Smith&amp;identifier=13.2.4.11.4%7C847366"), @ApiMethod(methodName = "patchById", description="The search URL to use. The format of this URL should be of the form ResourceTypeParameters, for example: Patientname=Smith&amp;identifier=13.2.4.11.4%7C847366"), @ApiMethod(methodName = "patchByUrl", description="The search URL to use. The format of this URL should be of the form ResourceTypeParameters, for example: Patientname=Smith&amp;identifier=13.2.4.11.4%7C847366")})
    private String url;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public String getPatchBody() {
        return patchBody;
    }

    public void setPatchBody(String patchBody) {
        this.patchBody = patchBody;
    }

    public ca.uhn.fhir.rest.api.PreferReturnEnum getPreferReturn() {
        return preferReturn;
    }

    public void setPreferReturn(ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn) {
        this.preferReturn = preferReturn;
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
