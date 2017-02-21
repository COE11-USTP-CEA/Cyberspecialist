package com.sample.sparkdemo;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;

/**
 *
 * @author jaypax
 */
public class DemoMain {

    public static void main(String[] args) {
        staticFiles.location("/css"); // Static files
        
        get("/hello", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title","SparkJava Demo");
            model.put("message", "Hello Freemarker!");
            return new ModelAndView(model, "hello.ftl"); // located in src/test/resources/spark/template/freemarker
        }, new FreeMarkerEngine());
    }
}
