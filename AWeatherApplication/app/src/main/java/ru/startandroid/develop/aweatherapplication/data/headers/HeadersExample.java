package ru.startandroid.develop.aweatherapplication.data.headers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeadersExample {

    @SerializedName("Transfer-Encoding")
    @Expose
    private String transferEncoding;
    @SerializedName("Connection")
    @Expose
    private String connection;
    @SerializedName("Vary")
    @Expose
    private String vary;
    @SerializedName("CDN-PullZone")
    @Expose
    private String cDNPullZone;
    @SerializedName("CDN-Uid")
    @Expose
    private String cDNUid;
    @SerializedName("CDN-RequestCountryCode")
    @Expose
    private String cDNRequestCountryCode;
    @SerializedName("CDN-ProxyVer")
    @Expose
    private String cDNProxyVer;
    @SerializedName("CDN-RequestPullSuccess")
    @Expose
    private String cDNRequestPullSuccess;
    @SerializedName("CDN-RequestPullCode")
    @Expose
    private String cDNRequestPullCode;
    @SerializedName("CDN-CachedAt")
    @Expose
    private String cDNCachedAt;
    @SerializedName("CDN-EdgeStorageId")
    @Expose
    private String cDNEdgeStorageId;
    @SerializedName("CDN-Status")
    @Expose
    private String cDNStatus;
    @SerializedName("CDN-RequestId")
    @Expose
    private String cDNRequestId;
    @SerializedName("CDN-Cache")
    @Expose
    private String cDNCache;
    @SerializedName("Cache-Control")
    @Expose
    private String cacheControl;
    @SerializedName("Content-Type")
    @Expose
    private String contentType;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Server")
    @Expose
    private String server;

    public String getTransferEncoding() {
        return transferEncoding;
    }

    public void setTransferEncoding(String transferEncoding) {
        this.transferEncoding = transferEncoding;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getVary() {
        return vary;
    }

    public void setVary(String vary) {
        this.vary = vary;
    }

    public String getCDNPullZone() {
        return cDNPullZone;
    }

    public void setCDNPullZone(String cDNPullZone) {
        this.cDNPullZone = cDNPullZone;
    }

    public String getCDNUid() {
        return cDNUid;
    }

    public void setCDNUid(String cDNUid) {
        this.cDNUid = cDNUid;
    }

    public String getCDNRequestCountryCode() {
        return cDNRequestCountryCode;
    }

    public void setCDNRequestCountryCode(String cDNRequestCountryCode) {
        this.cDNRequestCountryCode = cDNRequestCountryCode;
    }

    public String getCDNProxyVer() {
        return cDNProxyVer;
    }

    public void setCDNProxyVer(String cDNProxyVer) {
        this.cDNProxyVer = cDNProxyVer;
    }

    public String getCDNRequestPullSuccess() {
        return cDNRequestPullSuccess;
    }

    public void setCDNRequestPullSuccess(String cDNRequestPullSuccess) {
        this.cDNRequestPullSuccess = cDNRequestPullSuccess;
    }

    public String getCDNRequestPullCode() {
        return cDNRequestPullCode;
    }

    public void setCDNRequestPullCode(String cDNRequestPullCode) {
        this.cDNRequestPullCode = cDNRequestPullCode;
    }

    public String getCDNCachedAt() {
        return cDNCachedAt;
    }

    public void setCDNCachedAt(String cDNCachedAt) {
        this.cDNCachedAt = cDNCachedAt;
    }

    public String getCDNEdgeStorageId() {
        return cDNEdgeStorageId;
    }

    public void setCDNEdgeStorageId(String cDNEdgeStorageId) {
        this.cDNEdgeStorageId = cDNEdgeStorageId;
    }

    public String getCDNStatus() {
        return cDNStatus;
    }

    public void setCDNStatus(String cDNStatus) {
        this.cDNStatus = cDNStatus;
    }

    public String getCDNRequestId() {
        return cDNRequestId;
    }

    public void setCDNRequestId(String cDNRequestId) {
        this.cDNRequestId = cDNRequestId;
    }

    public String getCDNCache() {
        return cDNCache;
    }

    public void setCDNCache(String cDNCache) {
        this.cDNCache = cDNCache;
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

}
