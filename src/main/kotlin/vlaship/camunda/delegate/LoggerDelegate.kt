package vlaship.camunda.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component
import java.util.logging.Logger

@Component
class LoggerDelegate : JavaDelegate {
    private val logger = Logger.getLogger(LoggerDelegate::javaClass.name)

    override fun execute(execution: DelegateExecution) {
        logger.info(
            "result [${execution.getVariable("result") as Boolean}] | "
                    + "processDefinitionId=${execution.processDefinitionId}, "
                    + "activityId=${execution.currentActivityId}, "
                    + "activityName='${execution.currentActivityName}', "
                    + "processInstanceId=${execution.processInstanceId}, "
                    + "businessKey=${execution.businessKey}, "
                    + "executionId=${execution.id}"
        )
    }
}
