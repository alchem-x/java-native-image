# Java native-image

Build App With GraalVM Native Image

### Export GraalVM Home

```sh
export GRAALVM_HOME=/path/to/GRAALVM_HOME
```

### Build Native Image

```sh
./gradlew build && ./build-native-image.sh
```

### Run

```sh
./app/build/app 
```
