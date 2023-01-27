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
## How to use it !

##### 1). Flutter's List tile Widget in compose

```kotlin
@Composable
fun ListTile(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent,
    elevation: Dp = 0.dp,
    shape: Shape = RoundedCornerShape(0.dp),
    borderStroke: BorderStroke = BorderStroke(0.dp, Color.Transparent),
    leading: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    title: @Composable () -> Unit = {},
    subTitle: @Composable () -> Unit = {},
    horizontalTitleGap:Dp = 5.dp,
    contentPadding:Dp = 15.dp,
    onTap: () -> Unit = {}
) {....}
```

##### 2). Flutter's List tile check box Widget in compose.

```kotlin
@Composable
fun ListTileCheckbox(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(8.dp),
    selected: Boolean,
    borderStroke: BorderStroke = BorderStroke(1.dp, Color.Gray),
    size: Dp = 25.dp,
    backgroundColor: Color = MaterialTheme.colors.primary,
    checkedColor: Color = Color.White,
    onChangeValue: (Boolean) -> Unit
) {...}
```

Please drop a star if you like it ❤️
