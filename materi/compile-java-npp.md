## Java compile and run using notepad++

press F5

### close console when finish running program
```batch
// compile and run java 1
cmd /c pushd "$(CURRENT_DIRECTORY)" && javac "$(FILE_NAME)" && java -cp . "$(NAME_PART)"
```

```batch
### not close console when finish running program
// compile and run java 2
cmd /k pushd "$(CURRENT_DIRECTORY)" && javac "$(FILE_NAME)" && java -cp . "$(NAME_PART)"
```
