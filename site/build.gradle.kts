import com.varabyte.kobweb.gradle.application.extensions.AppBlock.LegacyRouteRedirectStrategy
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import org.gradle.internal.impldep.org.eclipse.jgit.transport.ReceiveCommand.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}

group = "io.github.shub39.portfolio"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            head.add {
                link(rel = "preconnect", href = "https://fonts.googleapis.com")
                link(rel = "preconnect", href = "https://fonts.gstatic.com") { attributes["crossorigin"] = "" }
                link(
                    href = "https://fonts.googleapis.com/css2?family=JetBrains+Mono:ital,wght@0,100..800;1,100..800&display=swap",
                    rel = "stylesheet"
                )
            description.set("Powered by Kobweb")
        }
        legacyRouteRedirectStrategy.set(LegacyRouteRedirectStrategy.DISALLOW)
    }
}

kotlin {
    // This example is frontend only. However, for a fullstack app, you can uncomment the includeServer parameter
    // and the `jvmMain` source set below.
    configAsKobwebApplication("portfolio" /*, includeServer = true*/)

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
        }

        jsMain.dependencies {
            implementation(compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)

            // This default template uses built-in SVG icons, but what's available is limited.
            // Uncomment the following if you want access to a large set of font-awesome icons:
            // implementation(libs.silk.icons.fa)
            implementation(libs.kobwebx.markdown)
        }

        // Uncomment the following if you pass `includeServer = true` into the `configAsKobwebApplication` call.
//        jvmMain.dependencies {
//            compileOnly(libs.kobweb.api) // Provided by Kobweb backend at runtime
//        }
    }
}
}
