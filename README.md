[![](https://jitpack.io/v/elimu-ai/model.svg)](https://jitpack.io/#ai.elimu/model)

# model (library) 📦

Code library shared amongst the [Webapp](https://github.com/elimu-ai/webapp) and Android applications.

## Software Architecture 📐

[
  <img width="320" alt="Software Architecture" src="https://user-images.githubusercontent.com/15718174/83595568-fb6a1e00-a594-11ea-990a-10c0bd62ed11.png">
](https://github.com/elimu-ai/wiki/blob/main/SOFTWARE_ARCHITECTURE.md)

## Development 👩🏽‍💻

```
mvn clean
mvn compile
```

## Release 📦


To perform a release, follow these steps:

1. Merge your PR into the `main` branch
1. Wait for the ["Maven Release"](https://github.com/elimu-ai/model/actions/workflows/maven-release.yml) workflow to complete
1. Ensure that the new release version appears at https://jitpack.io/#ai.elimu/model with "Status: ok"

> [!IMPORTANT]
> After you publish a new release, remember to also bump the version in the Webapp repo and all Android app repos that depend on the `utils` library:
> * https://github.com/elimu-ai/webapp/blob/main/pom.xml
> * https://github.com/elimu-ai/analytics/blob/main/gradle/libs.versions.toml

### Write release notes 🗒️

If the PR that you merged contains _breaking changes_, go to https://github.com/elimu-ai/model/tags and press "Create release." Then write instructions on how to handle the breaking changes.

## Usage

After each release, the resulting `.jar` file gets uploaded to https://jitpack.io/#ai.elimu/model

### Gradle

`./build.gradle`:

```diff
repositories {
    mavenCentral()
+    maven { url "https://jitpack.io" }
}
```

`./app/build.gradle`:

```gradle
dependencies {
    implementation 'ai.elimu:model:<version>'
}
```

### Maven

`./pom.xml`:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

```xml
<dependency>
    <groupId>ai.elimu</groupId>
    <artifactId>model</artifactId>
    <version>Tag</version>
</dependency>
```

---

<p align="center">
  <img src="https://github.com/elimu-ai/webapp/blob/main/src/main/webapp/static/img/logo-text-256x78.png" />
</p>
<p align="center">
  elimu.ai - Free open-source learning software for out-of-school children 🚀✨
</p>
<p align="center">
  <a href="https://elimu.ai">Website 🌐</a>
  &nbsp;•&nbsp;
  <a href="https://github.com/elimu-ai/wiki#readme">Wiki 📃</a>
  &nbsp;•&nbsp;
  <a href="https://github.com/orgs/elimu-ai/projects?query=is%3Aopen">Projects 👩🏽‍💻</a>
  &nbsp;•&nbsp;
  <a href="https://github.com/elimu-ai/wiki/milestones">Milestones 🎯</a>
  &nbsp;•&nbsp;
  <a href="https://github.com/elimu-ai/wiki#open-source-community">Community 👋🏽</a>
  &nbsp;•&nbsp;
  <a href="https://www.drips.network/app/drip-lists/41305178594442616889778610143373288091511468151140966646158126636698">Support 💜</a>
</p>
