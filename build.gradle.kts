plugins {
    id("java")
    id("checkstyle")
}

group = "com.design"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.27.6")
}

tasks.test {
    useJUnitPlatform()
}

// Определяем доступные проекты
val projects = mapOf(
    "Ducks" to "ducks.DuckTestDrive",
    "WeatherStation" to "weatherstation.weather.WeatherStation",
    "StarBuzz" to "starbuzz.decorator.StarBuzzCoffee",
    "PizzaStore" to "factory.factoryMethod.Main"
)

projects.forEach { (name, mainClassName) ->
    tasks.register<JavaExec>("run$name") {
        group = "application"
        description = "Run $name"

        mainClass = mainClassName
        classpath = sourceSets.main.get().runtimeClasspath
    }
}

tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "-Dfile.encoding=UTF-8",
        "-Dsun.stdout.encoding=UTF-8",
        "-Dsun.stderr.encoding=UTF-8",
        "-Dconsole.encoding=UTF-8"
    )
}

// Конфигурация компиляции
tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}