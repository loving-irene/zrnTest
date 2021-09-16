package com.github.lovingirene.zrntest.services

import com.intellij.openapi.project.Project
import com.github.lovingirene.zrntest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
