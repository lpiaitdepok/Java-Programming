// Java compile and run using notepad++ and nppexec

# inside npp_exec console
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

```
// compile and run java 1
NPP_SAVE
cd $(CURRENT_DIRECTORY)
javac $(FILE_NAME)
java -cp . $(NAME_PART)
```

```
// compile and run java using sqlite class
NPP_SAVE
cd $(CURRENT_DIRECTORY)
javac $(FILE_NAME)
java -cp .;"./sqlite-jdbc-3.23.1.jar" $(NAME_PART)
```

# in console ( command prompt  windows or terminal linux )
```
// compile and run java 2
NPP_SAVE
cmd /c pushd "$(CURRENT_DIRECTORY)" && javac "$(FILE_NAME)" && java -cp . "$(NAME_PART)"
```
