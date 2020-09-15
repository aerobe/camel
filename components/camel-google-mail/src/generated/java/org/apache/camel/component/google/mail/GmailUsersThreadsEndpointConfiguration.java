
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.gmail.Gmail$Users$Threads}.
 */
@ApiParams(apiName = "threads", description = "The threads collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Immediately and permanently deletes the specified thread"), @ApiMethod(methodName = "get", description="Gets the specified thread"), @ApiMethod(methodName = "list", description="Lists the threads in the user's mailbox"), @ApiMethod(methodName = "modify", description="Modifies the labels applied to the thread"), @ApiMethod(methodName = "trash", description="Moves the specified thread to the trash"), @ApiMethod(methodName = "untrash", description="Removes the specified thread from the trash")})
@UriParams
@Configurer
public final class GmailUsersThreadsEndpointConfiguration extends GoogleMailConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "delete", description="The com.google.api.services.gmail.model.ModifyThreadRequest"), @ApiMethod(methodName = "get", description="The com.google.api.services.gmail.model.ModifyThreadRequest"), @ApiMethod(methodName = "list", description="The com.google.api.services.gmail.model.ModifyThreadRequest"), @ApiMethod(methodName = "modify", description="The com.google.api.services.gmail.model.ModifyThreadRequest"), @ApiMethod(methodName = "trash", description="The com.google.api.services.gmail.model.ModifyThreadRequest"), @ApiMethod(methodName = "untrash", description="The com.google.api.services.gmail.model.ModifyThreadRequest")})
    private com.google.api.services.gmail.model.ModifyThreadRequest content;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "delete", description="ID of the Thread to delete"), @ApiMethod(methodName = "get", description="The ID of the thread to retrieve"), @ApiMethod(methodName = "list", description="ID of the Thread to delete"), @ApiMethod(methodName = "modify", description="The ID of the thread to modify"), @ApiMethod(methodName = "trash", description="The ID of the thread to Trash"), @ApiMethod(methodName = "untrash", description="The ID of the thread to remove from Trash")})
    private String id;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "delete", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "get", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "list", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "modify", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "trash", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "untrash", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me")})
    private String userId;

    public com.google.api.services.gmail.model.ModifyThreadRequest getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.ModifyThreadRequest content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
