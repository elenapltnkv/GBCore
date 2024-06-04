plugins {
    id("java")
}

group = "elenapltnkv"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("com.squareup.okhttp3:okhttp:4.12.0")
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.17.0")
    implementation ("org.postgresql:postgresql:42.7.3")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnitPlatform()
}