import java.nio.ByteBuffer;
import net.quasardb.qdb.*;
import org.junit.*;

public class QdbEntryAttachTagTest {
    @Test(expected = QdbAliasNotFoundException.class)
    public void throwsAliasNotFound_whenEntryDoesntExists() {
        String tag = Helpers.createUniqueAlias();
        QdbEntry entry = Helpers.createEmptyBlob();

        entry.attachTag(tag); // <- throws
    }

    @Test(expected = QdbClusterClosedException.class)
    public void throwsClusterClosed_afterCallingQdbClusterClose() {
        QdbCluster cluster = Helpers.createCluster();
        String alias = Helpers.createUniqueAlias();
        String tag = Helpers.createUniqueAlias();

        QdbEntry entry = cluster.blob(alias);
        cluster.close();
        entry.attachTag(tag); // <- throws
    }

    @Test(expected = QdbReservedAliasException.class)
    public void throwsReservedAlias_whenAliasIsQdb() {
        String tag = Helpers.createUniqueAlias();
        QdbEntry entry = Helpers.getBlob(Helpers.RESERVED_ALIAS);

        entry.attachTag(tag); // <- throws
    }

    @Test(expected = QdbReservedAliasException.class)
    public void throwsReservedAlias_whenTagIsQdb() {
        QdbEntry entry = Helpers.createEmptyBlob();

        entry.attachTag(Helpers.RESERVED_ALIAS); // <- throws
    }

    @Test
    public void returnsTrue_whenCalledOnce() {
        QdbEntry entry = Helpers.createBlob();
        QdbTag tag = Helpers.createEmptyTag();

        boolean result = entry.attachTag(tag);

        Assert.assertTrue(result);
    }

    @Test
    public void returnsFalse_whenCalledTwice() {
        QdbEntry entry = Helpers.createBlob();
        QdbTag tag = Helpers.createEmptyTag();

        entry.attachTag(tag);
        boolean result = entry.attachTag(tag);

        Assert.assertFalse(result);
    }
}
