pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MAD Lab"
include(":CO1:app1")
include(":CO1:app2")
include(":CO1:app3")
include(":CO2:app3")
include(":CO2:app1")
