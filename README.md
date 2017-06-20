
Activity 四种启动模式
===============
设置activity启动模式，在`AndroidManifest.xml`
文件中activity标签里面设置`android:launchMode`属性，例如
```
        <activity
            android:name=".MainActivity"
            android:launchMode="standard">
             <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

```
## 1、standard 标准模式（默认）
 每次跳转都会创建一个新的实例，存储在调用者activity的任务栈中,即同一个任务栈中。
 
 ![standard](/standard.PNG )

## 2、singleTop
 这种模式类似与standard模式，但有一点不一样，仅当跳转的目标activity
 处于栈的顶部时，此时不会创建新的实例，会复用栈的顶部activity实例，
 即不会执行onCreate(),onStart()方法，会执行onResume(),onNewIntent()方法，
 此时还是处于同一个任务栈中。
 
  ![singleTop](/singleTop.PNG )

## 3、singleTask
 这种模式在跳转之前先去检查任务栈中是否有该实例，有就复用，没有就创建
 实例，任务栈中最多只有一个该实例。解决了任务栈中共享同一个activity实例。

 > 注意：如果任务栈中有该实例，则将该实例移动到栈的顶部，并且该实例前面的
 其他实例对象则从栈中全部移除
 
  ![singleTask](/singleTask.PNG )

## 4、singleInstance
这种模式基本与singleTask一致，但是唯一不同点是，activity所在的任务栈有且
只有一个activity，如果涉及到其它activity,则将该activity移动到其它任务栈，
即：一个任务栈最多只有一个activity实例，activity实例在application中共享
同一个对象，使用之前先去检测是否有该实例对象，没有则新建，有就复用。

![singleInstance](/singleInstance.PNG )

### 总结
![总结](/activity的四种启动模式.PNG )

