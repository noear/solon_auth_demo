package demo.dso;

import org.noear.grit.solon.GritAuthProcessor;

/**
 * @author noear 2021/5/28 created
 */
public class AuthProcessorImpl extends GritAuthProcessor {
    @Override
    protected long getSubjectId() {
        return Session.current.getSubjectId();
    }
}
