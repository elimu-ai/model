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

> [!IMPORTANT]
> After you publish a new release, remember to also bump the version in the Webapp repo and all Android app repos that depend on the `utils` library:
> * https://github.com/elimu-ai/webapp/blob/main/pom.xml
> * https://github.com/elimu-ai/appstore/blob/main/gradle/libs.versions.toml
> * https://github.com/elimu-ai/content-provider/blob/main/gradle/libs.versions.toml
> * analytics
>   * https://github.com/elimu-ai/analytics/blob/main/app/build.gradle
>   * https://github.com/elimu-ai/analytics/blob/main/utils/build.gradle
> * https://github.com/elimu-ai/launcher/blob/main/gradle/libs.versions.toml
> * https://github.com/elimu-ai/common-utils/blob/main/gradle/libs.versions.toml
> * https://github.com/elimu-ai/kukariri/blob/main/gradle/libs.versions.toml
> * https://github.com/elimu-ai/image-picker/blob/main/app/build.gradle
> * https://github.com/elimu-ai/sound-cards/blob/main/app/build.gradle
> * https://github.com/elimu-ai/vitabu/blob/main/gradle/libs.versions.toml
> * https://github.com/elimu-ai/filamu/blob/main/gradle/libs.versions.toml
> * https://github.com/elimu-ai/chat/blob/main/app/build.gradle

### Write release notes 🗒️

Go to https://github.com/elimu-ai/model/tags and press "Create release."

## Usage

[![](https://jitpack.io/v/elimu-ai/model.svg)](https://jitpack.io/#elimu-ai/model)

After each release, the resulting `.jar` file gets uploaded to https://jitpack.io/#elimu-ai/model

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
