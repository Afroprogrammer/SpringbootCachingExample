# SpringbootCachingExample

a simple springboot application to learn how to use caching in springboot. 

The @EnableCaching annotation triggers a post-processor that inspects every Spring bean for the presence of caching annotations on public methods. If such an annotation is found, a proxy is automatically created 
to intercept the method call and handle the caching behavior accordingly.


The @Cacheable annotation on the method level creates a cache of the things that method produces 