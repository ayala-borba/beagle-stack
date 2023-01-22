package br.com.zup.beagle.service

import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.FlexDirection
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Text
import org.springframework.stereotype.Service
import java.awt.SystemColor.text

@Service
class HomeService {
    fun createHome(): Screen {
        return Screen (
        content = Container(
                children = listOf(
                        Text("Hello, world!", textColor = "#FF0000").applyFlex(Flex(grow = 1.0)),
                        Text("Welcome to Beagle!").applyFlex(Flex(grow = 1.0))
                )
        ).applyFlex(Flex(flexDirection = FlexDirection.ROW))
        )
    }
}