public interface DataAPIFactory {
    DataConnection createDataConnection();
    DataQuery createDataQuery();
    DataSerializer createDataSerializer();
}
