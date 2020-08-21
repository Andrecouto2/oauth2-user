package br.com.mastertech.couto.usuario.controller

import br.com.mastertech.couto.usuario.models.User
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping(path = ["/user"])
    fun getUser(@AuthenticationPrincipal user: User): User {
        return user
    }
}