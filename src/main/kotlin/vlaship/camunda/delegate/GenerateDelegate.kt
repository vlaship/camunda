package vlaship.camunda.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component
import vlaship.camunda.RESULT
import java.util.*

@Component
class GenerateDelegate : JavaDelegate {

    override fun execute(execution: DelegateExecution) {
        val list =
            mutableListOf<Boolean>(Random().nextBoolean(), Random().nextBoolean(), Random().nextBoolean())
        execution.setVariable(RESULT, list)
    }

}
