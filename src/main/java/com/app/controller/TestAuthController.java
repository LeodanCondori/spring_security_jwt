package com.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
//@PreAuthorize("denyAll()")
/*public class TestAuthController {

    @GetMapping(path = "/hello")
    @PreAuthorize("permitAll()")
    public String hello(){
        return "Hello World!!!";
    }

    @GetMapping(path = "/hello-secured")
    @PreAuthorize("hasAuthority('READ')")
    public String helloSecured(){
        return "Hello World Secured!!!";
    }

    @GetMapping(path = "/hello-secured2")
    @PreAuthorize("hasAuthority('CREATE')")
    public String helloSecured2(){
        return "Hello World Secured 2!!!";
    }

    @GetMapping("/get")
    @PreAuthorize("hasAuthority('READ')")
    public String helloGet(){
        return "Hello World - GET";
    }

    @PostMapping("/post")
    @PreAuthorize("hasAuthority('CREATE') or hasAuthority('READ')")
    public String helloPost(){
        return "Hello World - POST";
    }

    @PutMapping("/put")
    public String helloPut(){
        return "Hello World - PUT";
    }

    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Hello World - DELETE";
    }

    @PatchMapping("/patch")
    @PreAuthorize("hasAuthority('REFACTOR')")
    public String helloPatch(){
        return "Hello World - PATCH";
    }
}
*/
public class TestAuthController {
    @GetMapping("/get")
    //@PreAuthorize("hasAuthority('READ')")
    public String helloGet(){
        return "Hello World - GET";
    }

    @PostMapping("/post")
    //@PreAuthorize("hasAuthority('CREATE') or hasAuthority('READ')")
    public String helloPost(){
        return "Hello World - POST";
    }

    @PutMapping("/put")
    public String helloPut(){
        return "Hello World - PUT";
    }

    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Hello World - DELETE";
    }

    @PatchMapping("/patch")
    //@PreAuthorize("hasAuthority('REFACTOR')")
    public String helloPatch(){
        return "Hello World - PATCH";
    }
}
