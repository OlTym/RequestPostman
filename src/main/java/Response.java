import com.google.gson.annotations.SerializedName;

public class Response {
    private String url;

    @SerializedName("form")
    private Form form = new Form();

    @SerializedName("headers")
    private Headers headers = new Headers();

    @SerializedName("json")
    private Json json = new Json();

    public String getUrl() {
        return url;
    }

    public Form getForm() {
        return form;
    }

    public Headers getHeaders() {
        return headers;
    }

    public Json getJson() {
        return json;
    }


    @Override
    public String toString() {
        return "Response{" +
                "url='" + url + '\'' +
                ", form=" + form +
                ", headers=" + headers +
                ", json=" + json +
                '}';
    }
}
