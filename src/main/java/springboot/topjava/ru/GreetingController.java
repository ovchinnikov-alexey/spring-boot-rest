package springboot.topjava.ru;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final int DEFAULT_ID = 1;

    @GetMapping
    public BaseResponse showStatus(@RequestParam(value = "name", required = false, defaultValue="World") String name) {

        final BaseResponse response = new BaseResponse(DEFAULT_ID, String.format("Hello, %s!", name));

        return response;
    }
}
