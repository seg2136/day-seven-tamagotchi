import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public Tamagotchi myTam; //initiating variable

//   public static void main(String[] args) {
//    staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//       HashMap<String, Object> model = new HashMap<String, Object>();
//       model.put("tasks", request.session().attribute("tasks"));
//
//       model.put("template", "templates/index.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//
    post("/stats", (request, response) -> {

      public static Tamagotchi myTam = new Tamagotchi("April"); //We're trying to create a new instance of April so that we can store her stats and then update them with each user input


      // HashMap<String, Object> model = new HashMap<String, Object>();
      // ArrayList<Task> tasks = request.session().attribute("tasks");
      //
      // if (tasks == null) {
      //   tasks = new ArrayList<Task>();
      //   request.session().attribute("tasks", tasks);
      // }
      //
      // String description = request.queryParams("description");
      // Task newTask = new Task(description);
      //
      // tasks.add(newTask);

      model.put("template", "templates/something.vtl"); //trying to call output that takes input and applies it to April's current status
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
