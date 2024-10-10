package io.github.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import io.github.shub39.portfolio.components.layouts.PageLayout
import io.github.shub39.portfolio.components.sections.ProjectCard
import io.github.shub39.portfolio.data.MY_PROJECTS
import org.jetbrains.compose.web.css.cssRem

@Page("projects")
@Composable
fun ProjectsShowcase() {
    PageLayout(
        title = "projects"
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(2.cssRem)
        ) {
            MY_PROJECTS.forEachIndexed { _, project ->
                ProjectCard(project)
            }
        }
    }
}