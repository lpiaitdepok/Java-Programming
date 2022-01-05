//compile-java-nppexec2.md

Java compile and run using notepad++ and nppexec
press F6

inside npp_exec Execute...
```
// compile java only 1
NPP_SAVE
cd $(CURRENT_DIRECTORY)
javac $(FILE_NAME)
```

```
// make a jar file
NPP_SAVE
cd "$(CURRENT_DIRECTORY)"
jar cvf "$(NAME_PART).jar" *.class
jar cfe "$(NAME_PART).jar" "$(NAME_PART)" "$(NAME_PART).class"
exit
```

```
// run a jar file
NPP_SAVE
cd "$(CURRENT_DIRECTORY)" 
java -jar "$(NAME_PART).jar"
exit
```