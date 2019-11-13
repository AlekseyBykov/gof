package alekseybykov.portfolio.patterns.gof.structural.proxy.embedded;

import alekseybykov.portfolio.patterns.gof.structural.proxy.PdfReportGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.String.format;

public class ProxyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(new PdfReportGenerator(),
                format("#%s# %s #%s#", "start report", args[0], "end report"));
    }
}
