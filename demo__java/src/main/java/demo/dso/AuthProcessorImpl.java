package demo.dso;

import org.noear.grit.solon.GritAuthProcessor;
import org.noear.grit.solon.GritAuthProcessor2;

/**
 * @author noear 2021/5/28 created
 */
public class AuthProcessorImpl extends GritAuthProcessor {
    @Override
    protected long getSubjectId() {
        return Session.current.getSubjectId();
    }
}
