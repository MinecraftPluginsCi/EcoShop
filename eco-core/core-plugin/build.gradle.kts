group = "com.willfp"
version = rootProject.version

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
}

tasks {
    build {
        dependsOn(publishToMavenLocal)
    }
}
