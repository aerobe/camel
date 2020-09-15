
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.MerchantAccountGateway}.
 */
@ApiParams(apiName = "merchantAccount", description = "",
           apiMethods = {@ApiMethod(methodName = "all"), @ApiMethod(methodName = "create"), @ApiMethod(methodName = "createForCurrency"), @ApiMethod(methodName = "fetchMerchantAccounts"), @ApiMethod(methodName = "find"), @ApiMethod(methodName = "update")})
@UriParams
@Configurer
public final class MerchantAccountGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "all"), @ApiMethod(methodName = "create"), @ApiMethod(methodName = "createForCurrency"), @ApiMethod(methodName = "fetchMerchantAccounts"), @ApiMethod(methodName = "find"), @ApiMethod(methodName = "update")})
    private com.braintreegateway.MerchantAccountCreateForCurrencyRequest currencyRequest;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "all"), @ApiMethod(methodName = "create"), @ApiMethod(methodName = "createForCurrency"), @ApiMethod(methodName = "fetchMerchantAccounts"), @ApiMethod(methodName = "find"), @ApiMethod(methodName = "update")})
    private String id;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "all"), @ApiMethod(methodName = "create"), @ApiMethod(methodName = "createForCurrency"), @ApiMethod(methodName = "fetchMerchantAccounts"), @ApiMethod(methodName = "find"), @ApiMethod(methodName = "update")})
    private Integer page;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "all"), @ApiMethod(methodName = "create"), @ApiMethod(methodName = "createForCurrency"), @ApiMethod(methodName = "fetchMerchantAccounts"), @ApiMethod(methodName = "find"), @ApiMethod(methodName = "update")})
    private com.braintreegateway.MerchantAccountRequest request;

    public com.braintreegateway.MerchantAccountCreateForCurrencyRequest getCurrencyRequest() {
        return currencyRequest;
    }

    public void setCurrencyRequest(com.braintreegateway.MerchantAccountCreateForCurrencyRequest currencyRequest) {
        this.currencyRequest = currencyRequest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public com.braintreegateway.MerchantAccountRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.MerchantAccountRequest request) {
        this.request = request;
    }
}
