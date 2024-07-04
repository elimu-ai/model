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

See [.github/workflows/maven-release.yml](.github/workflows/maven-release.yml)

> [!NOTE]
> To perform a release, go to https://github.com/elimu-ai/model/actions/workflows/maven-release.yml, and press "Run workflow."

![Run workflow](https://github.com/elimu-ai/wiki/assets/1451036/5bbfe03f-724c-4582-bc3c-411b763316db)

## Usage

[![](https://jitpack.io/v/elimu-ai/model.svg)](https://jitpack.io/#elimu-ai/model)

For usage in other code repositories, see https://jitpack.io/#elimu-ai/model

### Gradle

`./build.gradle`:

```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

`./app/build.gradle`:

```gradle
dependencies {
    implementation 'com.github.elimu-ai:model:<version>'
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
    <groupId>com.github.elimu-ai</groupId>
    <artifactId>model</artifactId>
    <version>Tag</version>
</dependency>
```

---

<p align="center">
  <img src="https://github.com/elimu-ai/webapp/blob/main/src/main/webapp/static/img/logo-text-256x78.png" />
</p>
<p align="center">
  elimu.ai - Free open-source learning software for out-of-school children ✨🚀
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
