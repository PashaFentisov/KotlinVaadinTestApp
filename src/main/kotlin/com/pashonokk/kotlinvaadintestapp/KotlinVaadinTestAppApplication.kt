package com.pashonokk.kotlinvaadintestapp

import com.vaadin.flow.component.page.AppShellConfigurator
import com.vaadin.flow.theme.Theme
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@Theme("custom")
class KotlinVaadinTestAppApplication: AppShellConfigurator{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<KotlinVaadinTestAppApplication>(*args)
        }
    }
    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}

