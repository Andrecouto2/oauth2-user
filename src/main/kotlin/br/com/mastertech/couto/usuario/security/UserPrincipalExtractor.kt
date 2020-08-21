package br.com.mastertech.couto.usuario.security

import br.com.mastertech.couto.usuario.models.User
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor
import org.springframework.stereotype.Component

@Component
class UserPrincipalExtractor : PrincipalExtractor {
    override fun extractPrincipal(map: MutableMap<String, Any>): Any {
        return User(map.get("id") as Integer, map.get("name") as String)
    }
}