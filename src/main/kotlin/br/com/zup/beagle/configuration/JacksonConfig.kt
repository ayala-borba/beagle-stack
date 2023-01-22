package br.com.zup.beagle.configuration

import br.com.zup.beagle.serialization.jackson.BeagleActionSerializer
import br.com.zup.beagle.serialization.jackson.BeagleComponentSerializer
import br.com.zup.beagle.serialization.jackson.BeagleScreenBuilderSerializer
import br.com.zup.beagle.serialization.jackson.BeagleScreenSerializer
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class JacksonConfig {
    @Bean
    fun mapper(): ObjectMapper {
        val module = SimpleModule()
        module.addSerializer(BeagleActionSerializer())
        module.addSerializer(BeagleComponentSerializer())
        module.addSerializer(BeagleScreenSerializer())
        module.addSerializer(BeagleScreenBuilderSerializer())

        val mapper = jacksonObjectMapper()
        mapper.registerModule(module)
        return mapper
    }
}
