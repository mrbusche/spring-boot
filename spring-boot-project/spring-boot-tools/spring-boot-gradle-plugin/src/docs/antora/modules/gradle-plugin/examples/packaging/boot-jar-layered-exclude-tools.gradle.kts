import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	java
	id("org.springframework.boot") version "{version-spring-boot}"
}

tasks.named<BootJar>("bootJar") {
	mainClass.set("com.example.ExampleApplication")
}

// tag::layered[]
tasks.named<BootJar>("bootJar") {
	layered {
		includeLayerTools.set(false)
	}
}
// end::layered[]
