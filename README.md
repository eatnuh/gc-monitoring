# gc-tuning

## 1. compile
```shell
javac Main.java
```

## 2. gc monitoring
```shell
java -verbose:gc Main
```

## 3. select GC
```shell
java -XX:+UseSerialGC Main
java -XX:+UseG1GC Main
java -XX:+UseZGC Main
```




