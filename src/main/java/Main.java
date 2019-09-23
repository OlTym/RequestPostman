import com.google.gson.Gson;

public class Main {
    private static final String URL = "https://postman-echo.com/post ";


    public static void main(String[] args) {

        String request = "foo1=bar1&foo2=bar2";
        String json = HttpUtil.sendRequest(URL, null, request);

        Gson gson = new Gson();
        Response response = gson.fromJson(json, Response.class);

        Form form = response.getForm();
        Json responseJson = response.getJson();
        Headers headers = response.getHeaders();

        StringBuilder sb = new StringBuilder();

        sb.append("url: ").append(response.getUrl()).append("\n").
                append("form :{\n").append("foo1: ").append(form.getFoo1()).append(",\n").
                append("foo2: ").append(form.getFoo2()).append("\n},\n").
                append("headers:{\n").append("x-forwarded-proto:").append(headers.getXforwardedport()).append(",\n").
                append("host: ").append(headers.getHost()).append(",\n").
                append("content-length: ").append(headers.getContentlength()).append(",\n").
                append("accept: ").append(headers.getAccept()).append(",\n").
                append("content-type: ").append(headers.getContenttype()).append(",\n").
                append("user-agent: ").append(headers.getUseragent()).append(",\n").
                append("x-forwarded-port: ").append(headers.getXforwardedport()).append(",\n}\n").
                append("json:{\n").append("foo1: ").append(responseJson.getFoo1()).append(",\n").
                append("foo2: ").append(responseJson.getFoo2()).append("\n}\n");


        System.out.println(sb.toString());
    }
}
