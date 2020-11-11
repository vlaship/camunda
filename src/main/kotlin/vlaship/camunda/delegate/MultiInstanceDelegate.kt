package vlaship.camunda.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component
import vlaship.camunda.RESULT

@Component
class MultiInstanceDelegate : JavaDelegate {

    override fun execute(execution: DelegateExecution) {
        val weather = execution.getVariable("weather") as Boolean

        println("MultiInstanceDelegate: $weather")

        execution.setVariable(RESULT, weather)
    }
}
