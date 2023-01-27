# flutter-in-compose

## Introduction

A library which builds flutter widgets and custom ui's in compose 😍

## Setup

To add flutter-in-compose library, add this dependency,

#### Step 1 :- Open setting.gradle file and paste the below code:

```gradle  
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
	maven { url 'https://jitpack.io' }
    }
}
```

#### Step 2 :- Add it in your root build.gradle at the end of repositories:

```gradle  
dependencies {  
  .....
  implementation 'com.github.nameisjayant:flutter-in-compose:$version'

}  
```
Please drop a star if you like it ❤️
