#!/usr/bin/env bash
cd "$(dirname "$0")" || exit 1

"$GRAALVM_HOME/bin/native-image" -jar app/build/libs/app.jar app/build/app

