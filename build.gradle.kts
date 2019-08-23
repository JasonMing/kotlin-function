import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.github.jasonming"
version = "1.0.0"

plugins {
    base
    kotlin("jvm") version "1.3.40"
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib", "1.3.40"))
    testImplementation(kotlin("test-junit5", "1.3.40"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.3.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

task<Jar>("sourcesJar") {
    from(sourceSets["main"].allSource)
    classifier = "sources"
}

publishing {
    publications {
        create<MavenPublication>("kotlinFunction") {
            from(components["java"])
            artifact(tasks["sourcesJar"])
            pom {
                name.set("Kotlin function extensions")
                description.set("The useful extensions for kotlin functions.")
                url.set("https://github.com/JasonMing/kotlin-function")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/JasonMing/kotlin-function/blob/master/LICENSE")
                    }
                }
                developers {
                    developer {
                        id.set("MiNG")
                        name.set("JasonMing")
                        email.set("developer@ming.gz.cn")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/JasonMing/kotlin-function.git")
                    developerConnection.set("scm:git:git@github.com:JasonMing/kotlin-function.git")
                    url.set("https://github.com/JasonMing/kotlin-function")
                }
            }
        }
    }
}