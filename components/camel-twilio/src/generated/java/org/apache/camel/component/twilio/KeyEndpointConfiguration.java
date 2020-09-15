
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Key}.
 */
@ApiParams(apiName = "key", description = "",
           apiMethods = {@ApiMethod(methodName = "deleter", description="Create a KeyDeleter to execute delete"), @ApiMethod(methodName = "fetcher", description="Create a KeyFetcher to execute fetch"), @ApiMethod(methodName = "reader", description="Create a KeyReader to execute read"), @ApiMethod(methodName = "updater", description="Create a KeyUpdater to execute update"), })
@UriParams
@Configurer
public final class KeyEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resources to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "reader", description="The unique string that identifies the resource"), @ApiMethod(methodName = "reader", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
