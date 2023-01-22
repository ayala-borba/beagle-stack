package br.com.zup.beagle.controller

import br.com.zup.beagle.service.HomeService
import br.com.zup.beagle.widget.layout.Screen
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class HomeController(private val homeService: HomeService) {
    @GetMapping("/home")
    fun createHome() : Screen = this.homeService.createHome()
}