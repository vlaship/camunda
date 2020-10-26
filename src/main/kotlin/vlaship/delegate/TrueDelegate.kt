package vlaship.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component
import vlaship.service.TestService

@Component
class TrueDelegate(private val testService: TestService) : JavaDelegate {

    override fun execute(execution: DelegateExecution) {
        testService.printTrue()
    }

}