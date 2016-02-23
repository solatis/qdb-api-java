package net.quasardb.qdb;

import java.nio.ByteBuffer;
import java.util.List;
import net.quasardb.qdb.jni.*;

/**
 * Represents a tag in a quasardb database.
 */
public final class QdbTag extends QdbEntry {
    protected QdbTag(final SWIGTYPE_p_qdb_session session, final String alias) {
        super(session, alias);
    }

    /**
     * Retrieves the list of tags of the entry
     *
     * @return The entry's list of tags
     * @throws QdbException TODO
     */
    public List<String> getEntries() {
        results_list res = qdb.get_tagged(session, alias);
        QdbExceptionThrower.throwIfError(res.getError());
        return resultsToList(res.getResults());
    }
}