## Java compile and run using notepad++ and nppexec

press F6

### inside npp_exec Execute...
```
// compile java only 1
NPP_SAVE
cd $(CURRENT_DIRECTORY)
javac $(FILE_NAME)
```

```
// run java only 1
// without package
NPP_SAVE
cd $(CURRENT_DIRECTORY)
java -cp . $(NAME_PART)
```

```bash
// compile and run java 1
NPP_SAVE
cd $(CURRENT_DIRECTORY)
javac $(FILE_NAME)
IF $(EXITCODE) != 0 GOTO EXITSCRIPT
java -cp . $(NAME_PART)
:EXITSCRIPT
```

```bash
// compile and run java using package
NPP_SAVE
cd $(CURRENT_DIRECTORY)
javac "../package_folder/$(FILE_NAME)"
IF $(EXITCODE) == 1 GOTO EXITSCRIPT
NPP_SETFOCUS Con
java -cp .. "package_folder/$(NAME_PART)"
: EXITSCRIPT
```

```
// compile and run java using sqlite class
NPP_SAVE
cd $(CURRENT_DIRECTORY)
javac $(FILE_NAME)
NPP_SETFOCUS con
java -cp .;"./sqlite-jdbc-3.23.1.jar" $(NAME_PART)
```
using jdbc library in : https://github.com/xerial/sqlite-jdbc/


```
//  compile and run java using package
NPP_SAVE
cd $(CURRENT_DIRECTORY)
java -d . package-name.$(FILE_NAME)
IF $(EXITCODE) == 1 GOTO EXITSCRIPT
NPP_SETFOCUS Con
java "package_folder.$(NAME_PART)"
: EXITSCRIPT
```

### in console ( command prompt  windows or terminal linux )
```
// compile and run java 2
NPP_SAVE
cmd /c pushd "$(CURRENT_DIRECTORY)" && javac "$(FILE_NAME)" && java -cp . "$(NAME_PART)"
```
