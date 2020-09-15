
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Message}.
 */
@ApiParams(apiName = "message", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a MessageCreator to execute create"), @ApiMethod(methodName = "deleter", description="Create a MessageDeleter to execute delete"), @ApiMethod(methodName = "fetcher", description="Create a MessageFetcher to execute fetch"), @ApiMethod(methodName = "reader", description="Create a MessageReader to execute read"), @ApiMethod(methodName = "updater", description="Create a MessageUpdater to execute update"), })
@UriParams
@Configurer
public final class MessageEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "deleter", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "deleter", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "fetcher", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "fetcher", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "reader", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "reader", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "updater", description="The text of the message you want to send"), @ApiMethod(methodName = "updater", description="The text of the message you want to send. Can be up to 1,600 characters in length.")})
    private String body;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "creator", description="The phone number that initiated the message"), @ApiMethod(methodName = "deleter", description="The phone number that initiated the message"), @ApiMethod(methodName = "deleter", description="The phone number that initiated the message"), @ApiMethod(methodName = "fetcher", description="The phone number that initiated the message"), @ApiMethod(methodName = "fetcher", description="The phone number that initiated the message"), @ApiMethod(methodName = "reader", description="The phone number that initiated the message"), @ApiMethod(methodName = "reader", description="The phone number that initiated the message"), @ApiMethod(methodName = "updater", description="The phone number that initiated the message"), @ApiMethod(methodName = "updater", description="The phone number that initiated the message")})
    private com.twilio.type.PhoneNumber from;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "creator", description="The URL of the media to send with the message"), @ApiMethod(methodName = "deleter", description="The URL of the media to send with the message"), @ApiMethod(methodName = "deleter", description="The URL of the media to send with the message"), @ApiMethod(methodName = "fetcher", description="The URL of the media to send with the message"), @ApiMethod(methodName = "fetcher", description="The URL of the media to send with the message"), @ApiMethod(methodName = "reader", description="The URL of the media to send with the message"), @ApiMethod(methodName = "reader", description="The URL of the media to send with the message"), @ApiMethod(methodName = "updater", description="The URL of the media to send with the message"), @ApiMethod(methodName = "updater", description="The URL of the media to send with the message")})
    private java.util.List<java.net.URI> mediaUrl;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "deleter", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "deleter", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "fetcher", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "fetcher", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "reader", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "reader", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "updater", description="The SID of the Messaging Service you want to associate with the message"), @ApiMethod(methodName = "updater", description="The SID of the Messaging Service you want to associate with the message")})
    private String messagingServiceSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resources to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "creator", description="The unique string that identifies the resource"), @ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "reader", description="The unique string that identifies the resource"), @ApiMethod(methodName = "reader", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "creator", description="The destination phone number"), @ApiMethod(methodName = "deleter", description="The destination phone number"), @ApiMethod(methodName = "deleter", description="The destination phone number"), @ApiMethod(methodName = "fetcher", description="The destination phone number"), @ApiMethod(methodName = "fetcher", description="The destination phone number"), @ApiMethod(methodName = "reader", description="The destination phone number"), @ApiMethod(methodName = "reader", description="The destination phone number"), @ApiMethod(methodName = "updater", description="The destination phone number"), @ApiMethod(methodName = "updater", description="The destination phone number")})
    private com.twilio.type.PhoneNumber to;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.PhoneNumber from) {
        this.from = from;
    }

    public java.util.List<java.net.URI> getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(java.util.List<java.net.URI> mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMessagingServiceSid() {
        return messagingServiceSid;
    }

    public void setMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
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

    public com.twilio.type.PhoneNumber getTo() {
        return to;
    }

    public void setTo(com.twilio.type.PhoneNumber to) {
        this.to = to;
    }
}
