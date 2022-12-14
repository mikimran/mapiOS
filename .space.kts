/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Run me on git push and at 8 AM UTC") {

    startOn {
        gitPush { enabled = true }
        schedule { cron("0 8 * * *") }
    }
    
    requirements {
        workerPool = WorkerPools.SELF_HOSTED // not necessary if workerType is specified
    }
    
    host("Run script") {
        shellScript {
            content = "echo Hello World!"
        }
    }
}