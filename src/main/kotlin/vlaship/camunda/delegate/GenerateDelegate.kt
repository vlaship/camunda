package vlaship.camunda.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component
import java.util.*

@Component
class GenerateDelegate : JavaDelegate {

    override fun execute(execution: DelegateExecution) {
        execution.setVariable("result", Random().nextBoolean())
    }

}