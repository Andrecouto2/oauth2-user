package br.com.mastertech.couto.usuario

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class UsuarioApplication

fun main(args: Array<String>) {
    runApplication<UsuarioApplication>(*args)
}
