package org.aworley.shifty.teapot;

/**
 * Created by adam on 20/02/2017.
 */

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "/teapot")
public class TeapotController {


    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @ResponseBody
    public String teapot(){
        return "I'm a teapot";
    }

}
