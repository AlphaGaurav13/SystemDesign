import java.util.HashMap;

class HttpRequestBuilder{
    //header
    //body
    //url

    private String url;
    private String body;
    private HashMap<String,String> header;
    private String method;

    private HttpRequestBuilder()
    {

    }

    public static class Builder{
        private HttpRequestBuilder request= new HttpRequestBuilder();

        public Builder url(String url)
        {
            request.url=url;
            return this;
        }

        public Builder method(String method)
        {
            request.method=method;
            return this;
        }

        public Builder header(String key,String value){
            if(request.header==null){
                request.header=new HashMap<>();
            }

            request.header.put(key,value);
            return this;
        }

        public Builder body(String body){
            request.body=body;
            return this;
        }

        public HttpRequestBuilder build(){
            if(request.url==null){
                throw new IllegalStateException("Url Needed");
            }
            return request;
        }
    }
}

public class HttpRequestDemo {
    public static void main(String[] args) {
        HttpRequestBuilder.Builder builder = new HttpRequestBuilder.Builder();
        HttpRequestBuilder request = builder
        .url("https://ums.lpu.com")
        .method("POST")
        .header("Content-Type", "application/json")
        .body("{\"key\": \"value\"}")
        .build();
    }
}