# Sendmail
Send mail from application using Java Mail api

To get a Git project into your build:

# Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

# Step 2. Add the dependency

```
dependencies {
  implementation 'com.github.airmedsolutions:sendmail:Tag'
}
```

# How to use this library:
Kotlin:
```
val mail = SendMail("<sender-email>", "<sender-password>", "<receiver-email>", "<subject>", "<message-body>")
mail.execute()
```

Java:
```
SendMail mail = new SendMail("<sender-email>", "<sender-password>", "<receiver-email>", "<subject>", "<message-body>");
mail.execute();
```
