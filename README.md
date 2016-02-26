# An AWS Lambda Example to use Predefined Interfaces for Creating Handler.

This AWS Lambda function example correspond to AWS documentation example about how to use predefined interfaces for creating Handler with Custom POJO Input/Output (Leverage the RequestHandler Interface).

The AWS documentation URL is:
http://docs.aws.amazon.com/lambda/latest/dg/java-handler-using-predefined-interfaces.html

### Building the Lambda Package

1. Clone this repo

```
git clone git@github.com:pentasoft/lambda-hello-example.git
cd lambda-hello-example
```

2. Install dependencies with Maven

```
mvn install
```

3. Build lambda
Follow all steps in:
http://docs.aws.amazon.com/lambda/latest/dg/java-create-jar-pkg-maven-and-eclipse.html


### Lambda Function

1. Create a new Lambda function.
2. Upload the ZIP package to your lambda function.
3. Lambda configuration:
 * Handler: io.pst.lambda.hello.example.Hello::handleRequest

### Test Lambda

Push Test button and introduce test event

```json
{
  "firstName": "John",
  "lastName": "Doe"
}
```
The Lambda function must return:

```json
{
  "greetings": "Hello John Doe."
}
```
