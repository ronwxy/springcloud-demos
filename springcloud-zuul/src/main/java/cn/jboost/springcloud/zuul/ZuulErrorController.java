package cn.jboost.springcloud.zuul;

import com.google.common.collect.Maps;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ZuulErrorController implements ErrorController {

    @RequestMapping("/error")
    public Map<String, String> error(HttpServletRequest request){
        Map<String, String> result = Maps.newHashMap();
        result.put("code", request.getAttribute("javax.servlet.error.status_code").toString());
        result.put("message", request.getAttribute("javax.servlet.error.message").toString());
        result.put("exception", request.getAttribute("javax.servlet.error.exception").toString());
        return result;
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
