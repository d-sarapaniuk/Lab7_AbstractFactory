public class FileAPIFactory implements DataAPIFactory {
    @Override
    public DataConnection createDataConnection() {
        return new FileConnection();
    }

    @Override
    public DataQuery createDataQuery() {
        return new FileQuery();
    }

    @Override
    public DataSerializer createDataSerializer() {
        return new FileSerializer();
    }
}
