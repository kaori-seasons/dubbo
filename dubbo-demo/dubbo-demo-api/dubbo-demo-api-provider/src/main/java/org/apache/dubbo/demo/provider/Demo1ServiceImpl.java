package org.apache.dubbo.demo.provider;

public class Demo1ServiceImpl implements DemoService {

    private static final Logger logger = LoggerFactory.getLogger(Demo1ServiceImpl.class);


    @Override
    public String sayHello(String name) {
        logger.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public CompletableFuture<String> sayHelloAsync(String name) {
        return null;
    }

}

