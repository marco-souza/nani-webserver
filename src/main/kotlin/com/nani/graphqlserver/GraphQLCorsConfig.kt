package com.nani.graphqlserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@SpringBootApplication
class GraphQLCorsApplication {
	@Bean
	fun corsSetup(): WebMvcConfigurer {
		return object : WebMvcConfigurer {
			override fun addCorsMappings(registry: CorsRegistry) {
				// TODO: add cors for localhost
				registry.addMapping("/graphql").allowedOrigins("https://postwoman.io")
			}
		}
	}

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(GraphQLCorsApplication::class.java, *args)
		}
	}
}
