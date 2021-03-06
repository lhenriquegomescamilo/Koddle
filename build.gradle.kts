plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    mavenCentral()
    jcenter()
}

group = "me.koddle"
version = "1.0-SNAPSHOT"

val vertxVersion = "3.8.4"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    implementation("io.vertx:vertx-core:$vertxVersion")
    implementation("io.vertx:vertx-web:$vertxVersion")
    implementation("io.vertx:vertx-web-api-contract:$vertxVersion")
    implementation("io.vertx:vertx-lang-kotlin-coroutines:$vertxVersion")
    implementation("io.vertx:vertx-unit:$vertxVersion")
    implementation("io.vertx:vertx-lang-kotlin:$vertxVersion")
    implementation("io.vertx:vertx-pg-client:$vertxVersion")
    implementation("io.vertx:vertx-config:$vertxVersion")
    implementation("io.vertx:vertx-auth-jwt:$vertxVersion")
    implementation("org.flywaydb:flyway-core:6.0.0")
    implementation("postgresql:postgresql:9.1-901-1.jdbc4")
    implementation("org.koin:koin-core:2.0.1")
    implementation("org.koin:koin-core-ext:2.0.1")
    implementation("com.google.guava:guava:28.1-jre")

    implementation("org.reflections:reflections:0.9.11")
    implementation("org.slf4j:slf4j-jdk14:1.7.28")
    implementation("io.vertx:vertx-web-client:$vertxVersion")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.0")
    implementation("org.apache.commons:commons-collections4:4.0")
}
tasks.withType<Test> {
    useJUnitPlatform()
}

tasks {
    register("getHomeDir")  {
        doLast{
            println(gradle.gradleHomeDir)
        }
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}