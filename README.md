# TestJitpack

[![](https://jitpack.io/v/gdky005/TestJitpack.svg)](https://jitpack.io/#gdky005/TestJitpack) [![Build Status](https://travis-ci.org/gdky005/TestJitpack.svg?branch=master)](https://travis-ci.org/gdky005/TestJitpack) [![CircleCI](https://circleci.com/gh/gdky005/TestJitpack/tree/master.svg?style=svg)](https://circleci.com/gh/gdky005/TestJitpack/tree/master) [![codecov](https://codecov.io/gh/gdky005/TestJitpack/branch/master/graph/badge.svg)](https://codecov.io/gh/gdky005/TestJitpack) [![API](https://img.shields.io/badge/API-14%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=14) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/51a84a095c21449e82eca068e962bd35)](https://www.codacy.com/app/gdky005/TestJitpack?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=gdky005/TestJitpack&amp;utm_campaign=Badge_Grade) [![Coverity Scan Build Status](https://scan.coverity.com/projects/12557/badge.svg)](https://scan.coverity.com/projects/gdky005-testjitpack) [![gdky005](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-gdky005-orange.svg)](http://www.gdky005.com)


# 良心推荐
https://github.com/Blankj/AndroidUtilCode



# Travis CI 协议问题解决方案
http://stackoverflow.com/questions/37615379/travis-ci-build-doesnt-work-with-android-constraint-layout

# 存档链接
- http://www.jianshu.com/p/2935b96d3059

- https://shields.io 图标制作和预览

# Travis CI 和 Circle CI 遇到 android 协议解决办法

### Circle CI
	machine:
	  environment:
		  ANDROID_HOME: /usr/local/android-sdk-linux

	dependencies:
	  pre:
		- mkdir -p "$ANDROID_HOME/licenses"
		- echo -e "\n8933bad161af4178b1185d1a37fbf41ea5269c55" > "$ANDROID_HOME/licenses/android-sdk-license"
		- echo -e "\n84831b9409646a918e30573bab4c9c91346d8abd" > "$ANDROID_HOME/licenses/android-sdk-preview-license"

### Travis CI
	language: android

	android:
	  licenses:
		  - android-sdk-license-.+
		  - '.+'

	before_install:
	  - mkdir "$ANDROID_HOME/licenses" || true
	  - echo -e "\n8933bad161af4178b1185d1a37fbf41ea5269c55" > "$ANDROID_HOME/licenses/android-sdk-license"
	  - echo -e "\n84831b9409646a918e30573bab4c9c91346d8abd" > "$ANDROID_HOME/licenses/android-sdk-preview-license"






