package designPatterns.behavioralPattern.chainOfResponsibility;

/**
 * Created by Administrator on 2017/7/11.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
