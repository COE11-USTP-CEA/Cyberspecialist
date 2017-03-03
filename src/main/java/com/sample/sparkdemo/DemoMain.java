package com.sample.sparkdemo;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.sample.sparkdemo.model.Job;
import com.sample.sparkdemo.model.Company;

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
        post("/confirm", (req,res) -> {
                String name,address,job,qualification,requirement;

                name = req.queryParams("CompanyName");
                address = req.queryParams("CompanyAddress");
                job = req.queryParams("JobOffer");
                qualification = req.queryParams("qualification");
                requirement = req.queryParams("requirements");
            Map<String, Object> model = new HashMap<>();
            model.put("title","Job Social");
            model.put("message","Job Social");
            model.put("name", name);
            model.put("address", address);
            model.put("job", job);
            model.put("qualification", qualification);
            model.put("requirement", requirement);
            return new ModelAndView(model, "confirmation.ftl");
        }, new FreeMarkerEngine());

    }
}
