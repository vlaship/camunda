package vlaship.camunda.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component
import vlaship.camunda.service.TestService

@Component
class TrueDelegate(private val testService: TestService) : JavaDelegate {

    override fun execute(execution: DelegateExecution) {
        testService.printTrue()
    }

}