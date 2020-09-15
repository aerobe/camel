
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountry}.
 */
@ApiParams(apiName = "available-phone-number-country", description = "",
           apiMethods = {@ApiMethod(methodName = "fetcher", description="Create a AvailablePhoneNumberCountryFetcher to execute fetch"), @ApiMethod(methodName = "reader", description="Create a AvailablePhoneNumberCountryReader to execute read"), })
@UriParams
@Configurer
public final class AvailablePhoneNumberCountryEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "fetcher", description="The SID of the Account requesting the available phone number Country resource"), @ApiMethod(methodName = "fetcher", description="The SID of the Account requesting the available phone number Country resource"), @ApiMethod(methodName = "reader", description="The SID of the Account requesting the available phone number Country resource"), @ApiMethod(methodName = "reader", description="The SID of the Account requesting the available phone number Country resources")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "fetcher", description="The ISO country code of the country to fetch available phone number information about"), @ApiMethod(methodName = "fetcher", description="The ISO country code of the country to fetch available phone number information about"), @ApiMethod(methodName = "reader", description="The ISO country code of the country to fetch available phone number information about"), @ApiMethod(methodName = "reader", description="The ISO country code of the country to fetch available phone number information about")})
    private String pathCountryCode;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCountryCode() {
        return pathCountryCode;
    }

    public void setPathCountryCode(String pathCountryCode) {
        this.pathCountryCode = pathCountryCode;
    }
}
