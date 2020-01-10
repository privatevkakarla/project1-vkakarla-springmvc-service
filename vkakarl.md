# project1-vkakarla-springmvc-service

* This project will tell you about springMVC operations
* Using below URLs we can get person details
* http://localhost:8080/project1-vkakarla-springmvc-service/mvc/person-management/12345
  using aboe url we will get person
* http://localhost:8080/project1-vkakarla-springmvc-service/mvc/person-management/persons 
  using above url we will get persons
  
  
  #### Differences between @RequestParam and @PathVariable in Spring MVC

```Console
Both annotations @RequestParam and @PathVariable in Spring MVC are used for fetching the values of request parameters.
These annotations have similar purpose but some differences in use. 
The key difference between @RequestParam and @PathVariable is that @RequestParam used for accessing
the values of the query parameters where as @PathVariable used for accessing the values from the URI template.
```

## That is the different annotations from Spring and JAX-RS

**SPRING ANNOTATION**|**JAX-RS ANNOTATION**
--------------------|------------------
@RequestMapping(path = “/troopers” | @Path(“/troopers”)
@PostMapping	| @POST
@PutMapping	| @PUT
@GetMapping	| @GET
@DeleteMapping	| @DELETE
@ResponseBody	| N/A
@RequestBody	| N/A
@PathVariable(“id”)	| @PathParam(“id”)
@RequestParam(“xyz”)	| @QueryParam(‘xyz”)
@RequestParam(value=”xyz”)	| @FormParam(“xyz”)
@RequestMapping(produces = {“application/json”}) | 	@Produces(“application/json”)
@RequestMapping(consumes = {“application/json”}) |	@Consumes(“application/json”)

#### Diff between PathParam and QueryParam ?

* Path params are part of the url where as query parameters are added after the ? mark symbol and separated from other query parameters by & symbol.
 
```Java
PathParam example
GET http://base-url/students/{roll-number}  OR

@RequestMapping(path = “/base-url/students/{roll-number}”  == @Path(“/base-url/students/{roll-number}”)

QueryParam example
GET http://base-url/students?grade=10    OR

@RequestMapping(path = “/base-url/students/{roll-number}”  == @Path(“/base-url/students/{roll-number}”)
```

* **When to use @PathParam vs @QueryParam**
* This is not a standard, you can use anyone for designing restful api.

* However, the commonly used convention is :

  * Any required or mandatory attributes should be added as path param
  * Any optional attributes should be added as query param
  * params used for filtering data are usually used as query param
 
     