# Swagger API using OpenAPI Specification
### Open API Specification 
* In .NET Core, the OpenAPI Specification (OAS), formerly known as Swagger, is a standard way to describe RESTful APIs. 
* It provides a machine-readable representation of the API's endpoints, request/response formats, authentication methods, and more. <br>
#### Steps to Enable Swagger: <br>
##### Step 1: Install the Required NuGet Packages
* In ASP.NET Core project, First we need to install the Swashbuckle.AspNetCore NuGet package
* This can be done by using the Package Manager Console or the .NET CLI using the command dotnet add package Swashbuckle.AspNetCore <br>
##### Step 2: Configure Swagger in the Startup Class
* Open the Startup.cs file in project. 
* In the ConfigureServices method, add the following code to configure Swagger
```c#
services.AddSwaggerGen(options =>
            {
                options.SwaggerDoc("v1",
                    new Microsoft.OpenApi.Models.OpenApiInfo
                    {
                        Title = "API Name",
                        Description = "Demo for showing swagger",
                        Version = "v1"
                    });
            });
```
* Here, AddSwaggerGen() is used to configure Swagger generation for your API. It takes an Action parameter that can be used to customize the Swagger generation behavior.
* SwaggerDoc() is used to define a Swagger document for a specific API version.
##### step 3: Enable Swagger Middleware
* In the Configure method of Startup.cs, add the following code to enable the Swagger middleware
```
app.UseSwagger();
app.UseSwaggerUI(c =>
{
  c.SwaggerEndpoint("/swagger/v1/swagger.json", "swagger demo api");
});
```
* Here, app.UseSwagger() will automatically generate OpenAPI documentation in a dynamic path - swagger/v1/swagger.json
* app.UseSwaggerUI() configures the Swagger UI (User Interface) for exploring and interacting with the OpenAPI documentation of your API.
