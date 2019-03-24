module demo {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter.webflux;
    requires spring.web;
    requires java.sql;

    requires static lombok;

    opens com.example.demo to spring.core;

    exports com.example.demo to spring.beans, spring.context;
    exports com.example.demo.controllers to spring.beans, spring.webflux;
    exports com.example.demo.beans to com.fasterxml.jackson.databind;
}