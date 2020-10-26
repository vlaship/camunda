package vlaship.camunda.api

import org.camunda.bpm.engine.RuntimeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val runtimeService: RuntimeService) {

    @GetMapping("/")
    fun test() {
        runtimeService.startProcessInstanceByKey(
            "processCheck",
            "checkBusinessKey"
        )
    }

}