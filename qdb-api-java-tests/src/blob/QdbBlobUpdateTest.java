import java.nio.ByteBuffer;
import java.util.Date;
import net.quasardb.qdb.*;
import org.junit.*;

public class QdbBlobUpdateTest {
    @Test(expected = QdbIncompatibleTypeException.class)
    public void throwsIncompatibleType_afterCallingIntegerPut() {
        String alias = Helpers.createUniqueAlias();
        QdbInteger integer = Helpers.getInteger(alias);
        QdbBlob blob = Helpers.getBlob(alias);
        ByteBuffer newContent = Helpers.createSampleData();

        integer.put(666);
        blob.update(newContent); // <- throws
    }

    @Test(expected = QdbReservedAliasException.class)
    public void throwsReservedAlias() {
        ByteBuffer newContent = Helpers.createSampleData();

        QdbBlob blob = Helpers.getBlob("qdb");
        blob.update(newContent); // <- throws
    }
}