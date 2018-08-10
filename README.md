# Hello World Java Services

A working example of Java's ServiceLoader and the Service design pattern in Java.

In this application, the `HelloWorldService` interface describes a Java service that can return the phrase 'Hello World' translated to a specific language such as English, Spanish, or French. This interface provides the API for all service implementations that will be loaded into the application. At runtime, the `HelloWorldServiceLoader` looks at [src/resources/META-INF/services/com.hello.core.HelloWorldService](src/resources/META-INF/services/com.hello.core.HelloWorldService) to find implementations of the `HelloWorldService` interface. In this way, the application functionality can be extended by adding implementations of the `HelloWorldService` at runtime.
