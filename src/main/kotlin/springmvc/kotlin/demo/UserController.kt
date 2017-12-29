package springmvc.kotlin.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/")
    fun helloWorld() = "Hello World! We lost!"

}