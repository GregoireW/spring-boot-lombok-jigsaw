# spring-boot-lombok-jigsaw

This is a simple project to test if it is possible to use spring boot in a modular way (jigsaw) with lombok. 

After some issue, this seems to work fine. 

```bash
$ mvn package

$ java --module-path target/dependency/:target/demo-0.0.1-SNAPSHOT.jar -m demo/com.example.demo.DemoApplication
```

then to test:

```bash
curl http://localhost:8080
```

Unfortunatly, there is some automatic module left so that jlink is not yet usable without hack.
