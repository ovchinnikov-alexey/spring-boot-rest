package springboot.topjava.ru;

public class BaseResponse {

    private final Integer id;
    private final String content;

    public BaseResponse(Integer id, String content) {
        this.content = content;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}