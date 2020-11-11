package vlaship.camunda.delegate

import org.camunda.bpm.engine.delegate.BpmnError
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component
import java.util.logging.Logger

@Component
class LoggerDelegate : JavaDelegate {
    private val logger = Logger.getLogger(LoggerDelegate::javaClass.name)

    override fun execute(execution: DelegateExecution) {
        val list = execution.getVariable("weathers") as List<*>
        list.map {
            it as Boolean
        }

        if (list[2] == false) {
            throw BpmnError("555")
        }

        logger.info(
            "result [${list}] [${list.size}] | "
                    + "processDefinitionId=${execution.processDefinitionId}, "
                    + "activityId=${execution.currentActivityId}, "
                    + "activityName='${execution.currentActivityName}', "
                    + "processInstanceId=${execution.processInstanceId}, "
                    + "businessKey=${execution.businessKey}, "
                    + "executionId=${execution.id}"
        )
    }
}
