
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Address}.
 */
@ApiParams(apiName = "address", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a AddressCreator to execute create"), @ApiMethod(methodName = "deleter", description="Create a AddressDeleter to execute delete"), @ApiMethod(methodName = "fetcher", description="Create a AddressFetcher to execute fetch"), @ApiMethod(methodName = "reader", description="Create a AddressReader to execute read"), @ApiMethod(methodName = "updater", description="Create a AddressUpdater to execute update"), })
@UriParams
@Configurer
public final class AddressEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The city of the new address"), @ApiMethod(methodName = "creator", description="The city of the new address"), @ApiMethod(methodName = "deleter", description="The city of the new address"), @ApiMethod(methodName = "deleter", description="The city of the new address"), @ApiMethod(methodName = "fetcher", description="The city of the new address"), @ApiMethod(methodName = "fetcher", description="The city of the new address"), @ApiMethod(methodName = "reader", description="The city of the new address"), @ApiMethod(methodName = "reader", description="The city of the new address"), @ApiMethod(methodName = "updater", description="The city of the new address"), @ApiMethod(methodName = "updater", description="The city of the new address")})
    private String city;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The name to associate with the new address"), @ApiMethod(methodName = "creator", description="The name to associate with the new address"), @ApiMethod(methodName = "deleter", description="The name to associate with the new address"), @ApiMethod(methodName = "deleter", description="The name to associate with the new address"), @ApiMethod(methodName = "fetcher", description="The name to associate with the new address"), @ApiMethod(methodName = "fetcher", description="The name to associate with the new address"), @ApiMethod(methodName = "reader", description="The name to associate with the new address"), @ApiMethod(methodName = "reader", description="The name to associate with the new address"), @ApiMethod(methodName = "updater", description="The name to associate with the new address"), @ApiMethod(methodName = "updater", description="The name to associate with the new address")})
    private String customerName;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The ISO country code of the new address"), @ApiMethod(methodName = "creator", description="The ISO country code of the new address"), @ApiMethod(methodName = "deleter", description="The ISO country code of the new address"), @ApiMethod(methodName = "deleter", description="The ISO country code of the new address"), @ApiMethod(methodName = "fetcher", description="The ISO country code of the new address"), @ApiMethod(methodName = "fetcher", description="The ISO country code of the new address"), @ApiMethod(methodName = "reader", description="The ISO country code of the new address"), @ApiMethod(methodName = "reader", description="The ISO country code of the new address"), @ApiMethod(methodName = "updater", description="The ISO country code of the new address"), @ApiMethod(methodName = "updater", description="The ISO country code of the new address")})
    private String isoCountry;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will be responsible for the new Address resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will be responsible for the new Address resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that will be responsible for the new Address resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that is responsible for the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that will be responsible for the new Address resource"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that is responsible for this address"), @ApiMethod(methodName = "reader", description="The SID of the Account that will be responsible for the new Address resource"), @ApiMethod(methodName = "reader", description="The SID of the Account that is responsible for this address"), @ApiMethod(methodName = "updater", description="The SID of the Account that will be responsible for the new Address resource"), @ApiMethod(methodName = "updater", description="The SID of the Account that is responsible for the resource to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "reader", description="The unique string that identifies the resource"), @ApiMethod(methodName = "reader", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The postal code of the new address"), @ApiMethod(methodName = "creator", description="The postal code of the new address"), @ApiMethod(methodName = "deleter", description="The postal code of the new address"), @ApiMethod(methodName = "deleter", description="The postal code of the new address"), @ApiMethod(methodName = "fetcher", description="The postal code of the new address"), @ApiMethod(methodName = "fetcher", description="The postal code of the new address"), @ApiMethod(methodName = "reader", description="The postal code of the new address"), @ApiMethod(methodName = "reader", description="The postal code of the new address"), @ApiMethod(methodName = "updater", description="The postal code of the new address"), @ApiMethod(methodName = "updater", description="The postal code of the new address")})
    private String postalCode;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The state or region of the new address"), @ApiMethod(methodName = "creator", description="The state or region of the new address"), @ApiMethod(methodName = "deleter", description="The state or region of the new address"), @ApiMethod(methodName = "deleter", description="The state or region of the new address"), @ApiMethod(methodName = "fetcher", description="The state or region of the new address"), @ApiMethod(methodName = "fetcher", description="The state or region of the new address"), @ApiMethod(methodName = "reader", description="The state or region of the new address"), @ApiMethod(methodName = "reader", description="The state or region of the new address"), @ApiMethod(methodName = "updater", description="The state or region of the new address"), @ApiMethod(methodName = "updater", description="The state or region of the new address")})
    private String region;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The number and street address of the new address"), @ApiMethod(methodName = "creator", description="The number and street address of the new address"), @ApiMethod(methodName = "deleter", description="The number and street address of the new address"), @ApiMethod(methodName = "deleter", description="The number and street address of the new address"), @ApiMethod(methodName = "fetcher", description="The number and street address of the new address"), @ApiMethod(methodName = "fetcher", description="The number and street address of the new address"), @ApiMethod(methodName = "reader", description="The number and street address of the new address"), @ApiMethod(methodName = "reader", description="The number and street address of the new address"), @ApiMethod(methodName = "updater", description="The number and street address of the new address"), @ApiMethod(methodName = "updater", description="The number and street address of the new address")})
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }

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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
