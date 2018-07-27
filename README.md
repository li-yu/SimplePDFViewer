# SimplePDFViewer
一个炒鸡简陋的 PDF 文件阅读器组件，基于 PDF.js，精简了一些功能。
Ps. 同时学习下 `JitPack.io` 如何发布库文件。

## Usage

Step 1. Add the JitPack repository to your build file

```
allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
```

Step 2. Add the dependency

```
dependencies {
	        implementation 'com.github.li-yu:SimplePDFViewer:1.0.0'
	}
```

Step 3. Show time

```java
SimplePDFViewer.show(this, "http://xxx.xxx.xx/sample.pdf"); // also local file path.
```

## ScreenShots
<img src="ScreenShot.png" width="300px" />

### License ###
[Apache License Version 2.0](https://github.com/li-yu/SimplePDFViewer/blob/master/LICENSE)