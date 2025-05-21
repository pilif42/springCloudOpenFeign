# springCloudOpenFeign
Tutorial using spring-cloud-starter-openfeign

Here, I wrote myself com.example.springCloudOpenFeign.feignclient.jsonplaceholder.Client. To see an OpenFeign project built from an OpenAPI spec, see https://github.com/pilif42/springCloudOpenFeignFromContract.

# Used references
- https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html
- https://www.baeldung.com/spring-cloud-openfeign  

# To build
mvn clean install

# To run
mvn clean spring-boot:run

# To test
curl -v "http://localhost:8080/trigger"  
Expected output = 200 with [{"userId":1,"id":1,"title":"su....

# TODO
Generate a FeignClient for another API from its OpenAPI spec. Keep the existing com.example.springCloudOpenFeign.feignclient.jsonplaceholder.Client as a comparison.
