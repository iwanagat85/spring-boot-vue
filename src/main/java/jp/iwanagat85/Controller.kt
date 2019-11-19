package jp.iwanagat85

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller {

    @GetMapping("/api/message")
    fun getWelcomeMessage(): String {
        return "Welcome to Your Vue.js App from Spring"
    }
}