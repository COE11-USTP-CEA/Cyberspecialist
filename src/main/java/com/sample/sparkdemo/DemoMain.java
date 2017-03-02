package com.sample.sparkdemo;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;

public class DemoMain {

    public static void main(String[] args) {
        staticFiles.location("/css"); // Static files
        
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title","Job Social");
            model.put("message","Welcome to Job Social!");
            return new ModelAndView(model, "index.ftl"); // located in src/test/resources/spark/template/freemarker
        }, new FreeMarkerEngine());
        get("/about", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title2","About Job Social");
            model.put("message","Job Social");
            return new ModelAndView(model, "about.ftl"); // located in src/test/resources/spark/template/freemarker
        }, new FreeMarkerEngine());
         get("/add", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title","Job Social");
            return new ModelAndView(model, "addjob.ftl"); // located in src/test/resources/spark/template/freemarker
        }, new FreeMarkerEngine());
         get("/confirm", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title","Job Social");
            model.put("message","Job Social");
            return new ModelAndView(model, "confirmation.ftl"); // located in src/test/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

    }
}
