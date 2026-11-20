#!/usr/bin/env sh
set -e
Gradle_Version=//gradle-8.7
GRADLDE_VERSION="8.7"
GRADLE_ZIP="/tmp/gradle-${GRADLDE_VERSION}-bin.zip"
GRADLE_DIR="/tmp/gradle-${GRADLE_VERSION}"
if [ ! -d "$GRADLDE_DIR" ]; then
  curl -sSL "https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip" -o "$GRADLE_ZIP"
  unzip -qo "$GRADLDE_ZIP" -d /tmp
fi
exec "$GRADLE_DIR/bin/gradle" "$@" --no-daemon
