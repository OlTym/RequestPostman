import com.google.gson.annotations.SerializedName;

public class Headers {

    @SerializedName("x-forwarded-proto")
    private String xforwardedproto;

    @SerializedName("host")
    private String host;

    @SerializedName("content-length")
    private String contentlength;

    @SerializedName("accept")
    private String accept;


    @SerializedName("content-type")
    private String contenttype;

    @SerializedName("user-agent")
    private String useragent;

    @SerializedName("x-forwarded-port")
    private String xforwardedport;


    public String getXforwardedproto() {
        return xforwardedproto;
    }

    public String getHost() {
        return host;
    }

    public String getContentlength() {
        return contentlength;
    }

    public String getAccept() {
        return accept;
    }

    public String getContenttype() {
        return contenttype;
    }

    public String getUseragent() {
        return useragent;
    }

    public String getXforwardedport() {
        return xforwardedport;
    }

    @Override
    public String toString() {
        return "Headers{" +
                "xforwardedproto='" + xforwardedproto + '\'' +
                ", host='" + host + '\'' +
                ", contentlength='" + contentlength + '\'' +
                ", accept='" + accept + '\'' +
                ", contenttype='" + contenttype + '\'' +
                ", useragent='" + useragent + '\'' +
                ", xforwardedport='" + xforwardedport + '\'' +
                '}';
    }


}
