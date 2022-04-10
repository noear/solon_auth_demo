package demo.dso;

import org.noear.grit.model.domain.Subject;
import org.noear.grit.solon.SessionBase;

/**
 * @author noear 2022/4/10 created
 */
public class Session extends SessionBase {
    public static final Session current = new Session();
    @Override
    public void loadSubject(Subject subject) throws Exception {
        setSubjectId(subject.subject_id);
        setLoginName(subject.login_name);
        setDisplayName(subject.display_name);
    }
}
