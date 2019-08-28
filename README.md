# Fabric Template Mod

## Setup
1. Install java 8
2. Install Intellij IDEA
4. Open "build.gradle" with Intellij IDEA to import the project

#### Recommended setup on windows
1. Install [scoop]( https://github.com/lukesampson/scoop#installation ) with powershell
    ```powershell
    iex (new-object net.webclient).downloadstring('https://get.scoop.sh')
    ```

2. [Optional] Install [aria2]( https://github.com/aria2/aria2 ) with [scoop]( https://github.com/lukesampson/scoop#installation )
    ```powershell
    scoop install aria2
    ```
3. Add [buckets]( https://github.com/lukesampson/scoop#known-application-buckets ) to [scoop]( https://github.com/lukesampson/scoop#installation )
    ```powershell
    scoop bucket add java
    scoop bucket add jetbrains 
    scoop bucket add extra
    ```
4. Install java & IDEA with scoop
    ```powershell
   scoop install ojdkbuild8
   scoop install IntelliJ-IDEA
   ```
5. [Recommended] Restart the machine
## Note
  * Edit *.gradle and fabric.mod.json to suit your needs.
  * The "mixins" object can be removed from mod.json if you do not need to use mixins.
  * Please replace all occurences of "modid" or "templateid" with your own mod ID


## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
