package vlaship.service

import org.springframework.stereotype.Service

@Service
class TestServiceImpl : TestService {
    override fun printTrue() {
        printResult(true)
    }

    override fun printFalse() {
        printResult(false)
    }

    private fun printResult(result: Boolean) {
        println("result: $result")
    }
}


