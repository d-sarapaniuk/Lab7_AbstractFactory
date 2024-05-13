public class DBAPIFactory implements DataAPIFactory{
    @Override
    public DataConnection createDataConnection() {
        return new DBConnection();
    }

    @Override
    public DataQuery createDataQuery() {
        return new DBQuery();
    }

    @Override
    public DataSerializer createDataSerializer() {
        return new DBSerializer();
    }
}
