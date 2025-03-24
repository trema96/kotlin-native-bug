plugins {
    kotlin("multiplatform") version "2.1.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    val nativeTarget = mingwX64()

    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "run.main"
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
            }
        }
    }
}