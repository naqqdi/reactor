##### `Reactor`

[![](https://jitpack.io/v/dfmabbas/reactor.svg)](https://jitpack.io/#dfmAbbas/reactor)
[![License](http://img.shields.io/badge/license-MIT-green.svg?style=flat)](https://github.com/dfmabbas/reactor)
[![API](https://img.shields.io/badge/API-15%2B-blue.svg?style=flat)](https://github.com/dfmabbas/reactor)

**Reactor** is a `fast` and `secure` key-value library for Android, and has an embedded database based on the JSON structure and is a great alternative to Shared Preferences.


##### Features
- [x] `Save and restore a variety of objects (serialization and deserialization)`
- [x] `Symmetric encryption of objects (signed by target application at runtime + Hardware_ID)`
- [x] `Very high performance‍`
- [x] `Very low library size (No need for other libraries)`
- [x] `Supported and tested in API 15 and above`
- [x] `Minimal and easy to use :)`
- [ ] `Save and restore all objects at runtime in RAM`
- [ ] `Add a data branch (branches can be independent of the main branch) `
- [ ] `Imports data from Shared Preferences to Reactor`




##### Getting Started :

Add to your root build.gradle :
```Groovy
allprojects {
  repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }
```


Add the dependency :
```Groovy
dependencies {
    implementation 'com.github.dfmabbas:reactor:v1.2.4'
}
```



##### Simple API (default) :

In `Kotlin` :

```Groovy
val reactor = Reactor(context)
val reactor = Reactor(context, false) // disable encryption

-----------------------------------------------------------

reactor.put("name", "abbas")
reactor.put("age", 23)
reactor.put("this", this::class.java)

-----------------------------------------------------------

val name = reactor.get("name", "")
val isDay = reactor.get("day", false)
val thisClass = reactor.get("this", this::class.java)

-----------------------------------------------------------

reactor.remove("day", false)
reactor.clearAll()
```



In `Java` :

```Groovy
Reactor reactor = new Reactor(getContext());
Reactor reactor = new Reactor(getContext(), false); // disable encryption

-----------------------------------------------------------

reactor.put("name", "abbas");
reactor.put("age", 23);
reactor.put("array", new int[]{0, 0, 0});

-----------------------------------------------------------

String name = reactor.get("name", "");
Integer age = reactor.get("age", 0);
int[] array = reactor.get("array", new int[]{0, 0, 0});

-----------------------------------------------------------

reactor.remove("age", 0);
reactor.clearAll();
```



##### Advanced API :

In `Kotlin`: [sample code written with Kotlin](sample/src/main/java/com/dfmabbas/sample/KotlinSample.kt) .

In `Java`: [sample code written with Java](sample/src/main/java/com/dfmabbas/sample/JavaSample.java) .



##### License
```
MIT License

Copyright (c) 2018 Abbas Naqdi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE
```